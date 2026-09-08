
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

# Sets your wished config options for each generator
# $1: generator
# #2: input spec
# $3: target dir of the generation
config_options() {
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

  java -jar $openapi_generator_jar generate \
     -i "${inputspec}" -g "$generator" -o "${TARGET}" "$CONFIG_OPTIONS"

  echo "If the generation has succeeded, it's in ${TARGET} directory."
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
  exit 1
fi

if [ -z "${inputspec}" ]; then
  echo "inputspec missing"
  exit 1
fi

if [ ! -f "$2" ]; then
    echo "$2 spec not found"
    exit 1
fi

# Default to /tmp dir if target dir isn't specified
if [ -z "${target_dir}" ]; then
  target_dir=$(dirname "$(mktemp -u)")
fi

name=$(basename "${inputspec}" | cut -d. -f1)
export TARGET=$target_dir/$generator/$name

rm -rf "$TARGET"

config_options "$1" "$2"

if ! generating=$(generate "$1" "$inputspec_dir/$2" "$3"); then
  log "ERROR" "OpenAPI generator cannot generate $2 : $generating"
  exit $?
fi

if ! compiling=$(compile "$1" "$TARGET"); then
  log "ERROR" "Generated code with $1 generator on $2 doesn't compile : $compiling"
  exit $?
fi

# generate $1 $inputspec_dir/TMF632-Party_Management-v5.0.0.oas.yaml $3
