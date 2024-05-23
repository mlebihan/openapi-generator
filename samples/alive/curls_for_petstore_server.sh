#!/bin/bash

# Add new pet
add_petstore() {
  local rest_url=$1

  local id_pet="$2"
  local id_category="$3"
  local category_name="$4"
  local pet_name="$5"
  local photo_url="$6"
  local tag_id="$7"
  local tag_name="$8"

  local pet_to_add
  pet_to_add=$(cat - <<END_DOC
      {
        "id": $id_pet,
        "category": {
          "id": $id_category,
          "name": "$category_name"
        },
        "name": "$pet_name",
        "photoUrls": [
          "$photo_url"
        ],
        "tags": [
          {
            "id": $tag_id,
            "name": "$tag_name"
          }
        ]
      }
END_DOC
)

  echo "$pet_to_add"

  curl -X 'POST' \
    "$rest_url" \
    -H 'accept: application/xml' \
    -H 'Content-Type: application/json' \
    -d "$pet_to_add"
}

add_petstore "http://localhost:8080/v2/pet" "151" "12" "Dogs" "REX" "http://photosofrex/rex_rage.jpg" "1" "ferocious sales"
