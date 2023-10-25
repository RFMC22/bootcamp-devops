FROM openjdk:8
WORKDIR /app
COPY ./target/bootcamp-devops.jar .
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "bootcamp-devops.jar"]