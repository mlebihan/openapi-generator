# Distributed under the OSI-approved BSD 3-Clause License.  See accompanying
# file Copyright.txt or https://cmake.org/licensing for details.

cmake_minimum_required(VERSION 3.5)

file(MAKE_DIRECTORY
  "/home/lebihan/dev/Java/opensource/openapi-generator/samples/server/petstore/cpp-pistache-everything/cmake-build-debug/PISTACHE-prefix/src/PISTACHE"
  "/home/lebihan/dev/Java/opensource/openapi-generator/samples/server/petstore/cpp-pistache-everything/cmake-build-debug/PISTACHE-prefix/src/PISTACHE-build"
  "/home/lebihan/dev/Java/opensource/openapi-generator/samples/server/petstore/cpp-pistache-everything/cmake-build-debug/PISTACHE-prefix"
  "/home/lebihan/dev/Java/opensource/openapi-generator/samples/server/petstore/cpp-pistache-everything/cmake-build-debug/PISTACHE-prefix/tmp"
  "/home/lebihan/dev/Java/opensource/openapi-generator/samples/server/petstore/cpp-pistache-everything/cmake-build-debug/PISTACHE-prefix/src/PISTACHE-stamp"
  "/home/lebihan/dev/Java/opensource/openapi-generator/samples/server/petstore/cpp-pistache-everything/cmake-build-debug/PISTACHE-prefix/src"
  "/home/lebihan/dev/Java/opensource/openapi-generator/samples/server/petstore/cpp-pistache-everything/cmake-build-debug/PISTACHE-prefix/src/PISTACHE-stamp"
)

set(configSubDirs )
foreach(subDir IN LISTS configSubDirs)
    file(MAKE_DIRECTORY "/home/lebihan/dev/Java/opensource/openapi-generator/samples/server/petstore/cpp-pistache-everything/cmake-build-debug/PISTACHE-prefix/src/PISTACHE-stamp/${subDir}")
endforeach()
if(cfgdir)
  file(MAKE_DIRECTORY "/home/lebihan/dev/Java/opensource/openapi-generator/samples/server/petstore/cpp-pistache-everything/cmake-build-debug/PISTACHE-prefix/src/PISTACHE-stamp${cfgdir}") # cfgdir has leading slash
endif()
