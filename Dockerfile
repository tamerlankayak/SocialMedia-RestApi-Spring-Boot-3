FROM openjdk:17-alpine
EXPOSE 8080
ARG JAR_FILE=./target/spring-boot-example-restfulapi-0.0.1-SNAPSHOT.jar
ADD  ${JAR_FILE} social-media.jar
ENTRYPOINT ["java","-jar","/social-media.jar"]