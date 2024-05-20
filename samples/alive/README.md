Live demonstration and testing
==============================

Generates a server or a client, starts it, and test it with a prepared client tester or prepared server tester

Let's call:

__Y__ a `yaml` containing openapi specs.

__S__, a REST server of language __L__ and technology __T__ (ex: `java` with `jersey`, `go` with `gin-api-server`) generated from __Y__  
__C__, a REST client of language __L__ and technology __T__ generated for __Y__

__TS__, is a test __client__, written in Java, that will challenge a __S__ REST server when it is running (it's api server has started and is awaiting requests)  
__TC__, is a test __server__, written in Java, that will wait for a __C__ requests 

TS and TC extend respectively `AbstractTS` and `AbstractTC`, that are extending `AbstractT` class for themselves,
  - these abstract test classes are provided by our feature  
  - they add challenge and behavior to the test mechanism. 

Especially they write their test results into:  

__V__, a volume that will contain test results, in `L/T` folders

and this __V__ content is studied after __TS__ against __S__ or __TC__ against __C__ tests are run, to check the correctness of their execution and the validity/successfulness of the tests.

# Principle depicted with an example:

I want to check various generators for their handling of the classical `petstore.yaml`

# Testing REST servers

## TSPetstore : the test Java suite, challenging the server

It's a REST client able to test deeply a pestore server:  
it sends good or wrong values and checks its behavior.


## Let's say that I'm willing to test `cpp-pistache-server` behavior when it handles `petstore.yaml`
   
With `Y=petstore.yaml`, `L="cpp"`, `T="pistache-server"` I ask our feature to:

### Preparing the test environnement<L, T, TS>
     
- generate with a docker file an environment able to run a __L__ and __T__ compliant environment. 
  Here, able to compile and run C++.

- this container/environment has also a Java jdk and Spring-boot for testing purpose  

- take the __TS__ test written in Java and compile it in the docker environment

### Preparing candidate server for testing<S,Y>

- generates the __S__ REST api server (our `cpp-pistache-server`) from __Y__ yaml spec
- starts that REST api-server __S__ in background
- this __S__ server is now awaiting for requests to come
 
 
### Running the test<TS,S>

- the __TS__ test is run
- it write its results into `V:/L/T`, for instance: `V:/cpp/pistache-server`


When the test ends, the container ends soon too.   
(As the REST server has been ran in background if it is frozen has no importance, it won't hang the container) 

### Checking the results<S,V>

I can check the results in the volume `V:/L/T` for that __S__ api-server.

## Let's say that I'm willing to test `go-gin-apiserver` behavior when it handles `petstore.yaml` also

With `Y=petstore.yaml`, `L="go"`, `T="gin-apiserver"` I would like to do the same:

   - another docker container is generated for _Go_
   - and `gin-apiserver` is challenged with the same __TS__ test
   - its test result written to `V:/go/gin-apiserver`

# Testing REST clients

Respectively,

   - I have `TCPetstore` a Java test suite, a rest server able to test deeply a pestore client:  
     it waits for requests and respond with some prepared scheme


   - I'm willing to test `cpp-restsdk` (L: "cpp", T: "restsdk") against it


   - With `Y=petstore.yaml`, `L="cpp"`, `T="restsdk"` I ask our feature to do the same it does to test a REST server  
     except that it will take and compile __TC__ test and start it as a REST server, generates __C__, and test it


   - its test result written to `V:/cpp/restsdk`


# Expected benefits

- Generation, compilation, execution and test of many REST clients or many REST servers against a given spec


- The ability to compare results between differents langages and technology: We expect all the REST servers giving the same results when serving `petstore.yaml` and requested a certain manner. But is it the case?  
  `git diff` between `V:L/T` folders could check that. 


- The ability to exchange quickly the building and environment, to check if it would or is still working.
  For example, if one generator that is currently running `go 1.18` would stand `go 1.23` of if one still support `Java 8`
