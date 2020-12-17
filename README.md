# DDD-MW56
Test case for game MW56 with DDD

Its a representation of the game with the comunications between two microservices 

![alt text](http://seanriddle.com/gnw_mw56_left.svg)


## Map Context

- Fabric context: The sample library that we're creating the starter for.

- Transport Context: The project containing the auto-configuration for the library.

## Context map

- Shared Kernel: The custom starter for the library.



## Project 

### Technologies

- JAVA 11 
- Multi-Module Project
- Java reactive webflux
- Webclient
- Spring data JBDC
- Liquibase

### HOW TO DEPLOY

- docker build --tag fabric-context .
- docker run --publish 8000:8080 --detach --name bb fabric-context

- docker build --tag transport-context .
- docker run --publish 8000:8082 --detach --name cc transport-context

### HOW TO USE

- Start FabricContext project 
- Start TransportContect project
- curl --location --request POST 'http://localhost:8080/fabric/startProcess' \ --header 'Content-Type: text/plain' \ --header 'Cookie: JSESSIONID=3CAE8C1310EAC3D55CDE591BA07B9A23' \ --data-raw 'SERGIO'
