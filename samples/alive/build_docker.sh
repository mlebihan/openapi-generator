#!/bin/bash

FAILED="failed"
SUCCESS="success"

# Log a timestamped message
# $1 Severity
# $2 Message
log() {
   TIMESTAMP=$(date "+%Y-%m-%d %H:%M:%S")

   if [ "$1" = "ERROR" ]; then
      echo "$TIMESTAMP [$1] $2" >&2
   else
      echo "$TIMESTAMP [$1] $2"
   fi
}

# creates inside the volume a v:/${step_number}_${step_name}/${substep) file, if it doesn't exit yet, and then push a message into
# $1 : step number
# $2 : step name
# $3 : substep or final status (ok, failed...)
# $4 : global message
write() {
  if [ -z "$1" ]; then
     log "ERROR" "Step number is required for write function"
     exit $?
  fi

  if [ -z "$2" ]; then
     log "ERROR" "Step name is required for write function"
     exit $?
  fi

  if [ -z "$3" ]; then
     log "ERROR" "Substep is required for write function"
     exit $?
  fi

  local target_folder="$1_$2"
  local target_folder_inside_volume="${volume}/${target_folder}"

  if ! create_test_case_directory=$(mkdir -p "${target_folder_inside_volume}"); then
    log "ERROR" "Cannot create a test folder ${target_folder} inside ${volume}: ${create_test_case_directory} Exiting."
    exit $?
  fi

  local target_substep_file="${target_folder_inside_volume}/$3"

  if ! create_substep_file=$(touch "${target_substep_file}"); then
    log "ERROR" "Cannot create a file for substep $3 in ${target_folder_inside_volume}: ${create_substep_file} Exiting."
    exit $?
  fi

  echo -e "$4 >> ${target_substep_file}"
}

# copy the openapi generator executable from anywhere to our current folder, before docker building
# whole API_GENERATOR_EXECUTABLE for path where the wished openapi-generator jar to use can be found,
# can be provided, or they will receive default values
copy_openapi_generator_executable() {
  if [ -z "$API_GENERATOR_EXECUTABLE" ]; then
    API_GENERATOR_EXECUTABLE="../../modules/openapi-generator-cli/target/openapi-generator-cli.jar"
  fi

  if ! [ -f "${API_GENERATOR_EXECUTABLE}" ]; then
    log "ERROR" "The file '${API_GENERATOR_EXECUTABLE}' doesn't exit"
    exit 1
  fi

  cp "${API_GENERATOR_EXECUTABLE}" openapi-generator.jar
}

# --------------------------------------
# Main
# --------------------------------------

volume=$(mktemp --directory)
log "INFO" "Volume for gathering tests results is: ${volume}"

# Copy the openapi generator executable: the docker container will use it
if ! copy_openapi_generator_executable; then
  exit $?
fi

# Build test environment, with languages
if ! BUILD_ENV=$(sudo docker build . -t alive/core -f Dockerfile_testing_environment); then
  write "0210" "build_env" "${FAILED}" "${BUILD_ENV}"
  log "ERROR" "Failed to build test environment: ${BUILD_ENV}"
  exit $?
else
  write "0210" "build_env" "${SUCCESS}" "${BUILD_ENV}"
  log "INFO" "1/  - Test environment built"
fi

# Build tester
if ! BUILD_TEST=$(sudo docker build . -t alive/tester -f Dockerfile_tester); then
  write "0220" "build_tester" "${FAILED}" "${BUILD_TEST}"
  log "ERROR" "Failed to build tester: ${BUILD_TEST}"
  exit $?
else
  write "0220" "build_tester" "${SUCCESS}" "${BUILD_TEST}"
  log "INFO" "2/  - Tester built"
fi
