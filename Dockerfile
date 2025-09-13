FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/mysampleproject.jar  mysampleproject.jar

EXPOSE 8082

ENTRYPOINT [ "java","-jar","mysampleproject.jar" ]

