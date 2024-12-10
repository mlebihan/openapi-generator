# Distributed under the OSI-approved BSD 3-Clause License.  See accompanying
# file Copyright.txt or https://cmake.org/licensing for details.

cmake_minimum_required(VERSION 3.5)

file(MAKE_DIRECTORY
  "/home/lebihan/dev/Java/opensource/openapi-generator/samples/server/petstore/cpp-pistache-everything/cmake-build-debug/NLOHMANN-prefix/src/NLOHMANN"
  "/home/lebihan/dev/Java/opensource/openapi-generator/samples/server/petstore/cpp-pistache-everything/cmake-build-debug/NLOHMANN-prefix/src/NLOHMANN-build"
  "/home/lebihan/dev/Java/opensource/openapi-generator/samples/server/petstore/cpp-pistache-everything/cmake-build-debug/NLOHMANN-prefix"
  "/home/lebihan/dev/Java/opensource/openapi-generator/samples/server/petstore/cpp-pistache-everything/cmake-build-debug/NLOHMANN-prefix/tmp"
  "/home/lebihan/dev/Java/opensource/openapi-generator/samples/server/petstore/cpp-pistache-everything/cmake-build-debug/NLOHMANN-prefix/src/NLOHMANN-stamp"
  "/home/lebihan/dev/Java/opensource/openapi-generator/samples/server/petstore/cpp-pistache-everything/cmake-build-debug/NLOHMANN-prefix/src"
  "/home/lebihan/dev/Java/opensource/openapi-generator/samples/server/petstore/cpp-pistache-everything/cmake-build-debug/NLOHMANN-prefix/src/NLOHMANN-stamp"
)

set(configSubDirs )
foreach(subDir IN LISTS configSubDirs)
    file(MAKE_DIRECTORY "/home/lebihan/dev/Java/opensource/openapi-generator/samples/server/petstore/cpp-pistache-everything/cmake-build-debug/NLOHMANN-prefix/src/NLOHMANN-stamp/${subDir}")
endforeach()
if(cfgdir)
  file(MAKE_DIRECTORY "/home/lebihan/dev/Java/opensource/openapi-generator/samples/server/petstore/cpp-pistache-everything/cmake-build-debug/NLOHMANN-prefix/src/NLOHMANN-stamp${cfgdir}") # cfgdir has leading slash
endif()
