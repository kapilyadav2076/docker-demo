FROM openjdk:18
LABEL maintainer="Kapil Yadav"
ADD target/docker-demo.jar docker-demo.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","docker-demo.jar"]