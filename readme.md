# Reverse text API example

## Requiered software

- java 17 
- maven 3.6
- docker

## How to run

Run application in console

 - `mvn clean spring-boot:run` - run application locally without docker
 - `mvn clean test` - execute only tests

Build docker image

- `mvn clean package` build application adn create executable jar file
- `docker build  -t reverse .` create docker image
- `docker run -p 8080:8080 reverse` run docker container

## How to use aplication

- Open [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html) swagger api test page.

- Or use any http client to send such request:

> POST http://localhost:8080/string/reverce
>
>
> Hello world

- Or use `apitest.http` file for htttp clients which can use `*.http` files

