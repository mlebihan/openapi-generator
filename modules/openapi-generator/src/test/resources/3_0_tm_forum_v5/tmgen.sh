

# Generates an OpenAPI Rest client or server
# $1: generator
# $2: input spec
# $3: base target directory for all generation. If empty, /tmp so that it will generate into /tmp/TMF632-xxx, /tmp/TMF634-xxx, etc.
generate() {
  #openapi_generator_jar="modules/openapi-generator-cli/target/openapi-generator-cli.jar"
  openapi_generator_jar="../../../../../openapi-generator-cli/target/openapi-generator-cli.jar"

  generator=$1
  inputspec=$2
  target_dir=$3

  if [ -z "${generator}" ]; then
    echo "generateur missing"
    exit 1
  fi

  if [ -z "${inputspec}" ]; then
    echo "inputspec missing"
    exit 1
  fi

  # Default to /tmp dir if target dir isn't specified
  if [ -z "${target_dir}" ]; then
    target_dir=$(dirname "$(mktemp -u)")
  fi

  name=$(basename "${inputspec}" | cut -d. -f1)
  target=$target_dir/$generator/$name

  rm -rf "$target"

  java -jar $openapi_generator_jar generate \
     -i "${inputspec}" -g "$generator" -o "${target}"

  echo "If the generation has succeeded, it's in ${target} directory."
}

# Main procedure
#inputspec_dir="modules/openapi-generator/src/test/resources/3_0_tm_forum_v5"
inputspec_dir="."

generate $1 $inputspec_dir/TMF632-Party_Management-v5.0.0.oas.yaml $3
generate $1 $inputspec_dir/TMF634-Resource_Catalog_Management-v5.0.0.oas.yaml  $3
generate $1 $inputspec_dir/TMF638-Service_Inventory_Management-v5.1.0.oas.yaml $3
generate $1 $inputspec_dir/TMF639-Resource_Inventory_Management-v5.0.0.oas.yaml $3
generate $1 $inputspec_dir/TMF641-ServiceOrdering-v5.0.0.oas.yaml $3
generate $1 $inputspec_dir/TMF669-Party_Role_Management-v5.0.0.oas.yaml $3
generate $1 $inputspec_dir/TMF720-Digital_Identity_Management_API-v5.0.0.oas.yaml $3
