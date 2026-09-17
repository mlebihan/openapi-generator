
# Write a message
# $1; Severity
# $2; Message
log() {
   TIMESTAMP=$(date "+%Y-%m-%d %H:%M:%S")

   if [ "$1" = "ERROR" ]; then
      echo "$TIMESTAMP [$1] $2" >&2
   else
      echo "$TIMESTAMP [$1] $2"
   fi
}

# Sets your wished config options for each generator (if CONFIG_OPTIONS isn't already set)
# $1: generator
# #2: input spec
# $3: target dir of the generation
config_options() {
   if [ -n "${CONFIG_OPTIONS}" ]; then
      return
   fi

   case $1 in
      spring)
         CONFIG_OPTIONS=--additional-properties=oas3=true,useSpringBoot3=true,useJakartaEe=true,library=spring-boot
      ;;
   esac
}

# Compile the generated code for each generator
# $1: generator
# $2: target source path (after generation)
compile() {
   case $1 in
      rust-server)
        (cd "$2" && cargo build)
        ;;

      spring)
        (cd "$2" && mvn clean install)
        ;;
   esac
}


# Generates an OpenAPI Rest client or server
# $1: generator
# $2: input spec
# $3: base target directory for all generation. If empty, /tmp so that it will generate into /tmp/TMF632-xxx, /tmp/TMF634-xxx, etc.
generate() {
  #openapi_generator_jar="modules/openapi-generator-cli/target/openapi-generator-cli.jar"
  openapi_generator_jar="../../../../../openapi-generator-cli/target/openapi-generator-cli.jar"

  if [ -n "${CONFIG_OPTIONS}" ]; then
    java -jar $openapi_generator_jar generate \
       -i "${inputspec}" -g "$generator" -o "${TARGET}" "$CONFIG_OPTIONS" --skip-validate-spec
  else
    java -jar $openapi_generator_jar generate \
       -i "${inputspec}" -g "$generator" -o "${TARGET}" --skip-validate-spec
  fi

  echo "If the generation has succeeded, it's in ${TARGET} directory."
}

generate_and_compile() {
  if [ -z "${inputspec}" ]; then
    echo "inputspec missing"
    help
    exit 1
  fi

  if [ "${inputspec}" != "all" ]; then
    if [ ! -f "${inputspec}" ]; then
       echo "$inputspec spec not found"
       help
       exit 1
    fi
  fi

  if [ -z "${target_dir}" ]; then
     echo "target_dir isn't set"
     help
     exit 1
  fi

  name=$(basename "${inputspec}" | cut -d. -f1)
  export TARGET=$target_dir/$generator/$name
  rm -rf "$TARGET"

  config_options "${generator}" "${inputspec}"
  candidates=$((candidates+1))

  if ! generating=$(generate "${generator}" "$inputspec_dir/${inputspec}" "${target_dir}"); then
     log "ERROR" "OpenAPI generator failed to generate ${generator} code from ${inputspec}"
     last_error=$?
     failed_generation=$((failed_generation+1))
     echo "${generating}" > "${TARGET}/generation_failed.log"
     echo "Look generation result in ${TARGET}/generation_failed.log"
     return ${last_error}
  fi

  if ! compiling=$(compile "${generator}" "$TARGET"); then
     log "ERROR" "Generated code with ${generator} generator on ${inputspec} doesn't compile."
     last_error=$?
     failed_compilation=$((failed_compilation+1))
     echo "${compiling}" > "${TARGET}/compilation_failed.log"
     echo "Look compilation result in ${TARGET}/compilation_failed.log"
     return ${last_error}
  fi

  succeeded=$((succeeded+1))
}

help() {
  echo -e "tm-gen <generator> <input spec | all> [target_dir]"
  echo -e "\t generator: spring, rust-server"
  echo -e "\t input spec: all will attempt to generate and compile all the TM Forum yaml"
  echo -e "\t target_dir: for generation and compilation. Default to /tmp (dirname \$(mktemp -u) command output) if empty"
  echo -e ""
  echo -e "tm-gen is intended to run from 'openapi-generator/modules/openapi-generator/src/test/resources/3_0_tm_forum_v5' directory, at the moment"
  echo -e ""

  echo -e "Examples:"
  echo -e "tm-gen spring TMF641-ServiceOrdering-v5.0.0.oas.yaml"
  echo -e "tm-gen spring TMF641-ServiceOrdering-v5.0.0.oas.yaml ~/dev/Java/opensource/tmp_gen"
  echo -e "tm-gen spring all ~/dev/Java/opensource/tmp_gen"
}

# Main procedure
# $1: generator
# $2: Input spec
# $3: Source project directory name (i.e. TMF641-ServiceOrdering-v5) after generation
# $4: Target generation of OpenAPI code, by default: /tmp

#inputspec_dir="modules/openapi-generator/src/test/resources/3_0_tm_forum_v5"
inputspec_dir="."
generator=$1
inputspec=$2
target_dir=$3

if [ -z "${generator}" ]; then
  echo "generator missing"
  help
  exit 1
fi

if [ -z "${inputspec}" ]; then
  echo "inputspec missing"
  help
  exit 1
fi

if [ "${inputspec}" != "all" ]; then
  if [ ! -f "${inputspec}" ]; then
     echo "$inputspec spec not found"
     help
     exit 1
  fi
fi

# Default to /tmp dir if target dir isn't specified
if [ -z "${target_dir}" ]; then
  target_dir=$(dirname "$(mktemp -u)")
fi

candidates=0
succeeded=0
failed_generation=0
failed_compilation=0

if [[ "${inputspec}" == "all" ]]; then
  for spec in TMF*.yaml
    do inputspec="$spec"; generate_and_compile
  done
else
  generate_and_compile
fi

echo -e "${candidates} TM Forum specifications have been processed"
echo -e "   ${succeeded} have succeeded in generating their code and compiling it"
echo -e "   ${failed_generation} failed in generating it through OpenAPI generator"
echo -e "   ${failed_compilation} failed in compiling generated code"
