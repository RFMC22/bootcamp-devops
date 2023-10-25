FROM openjdk:8
EXPOSE 8080
ADD target/bootcamp-devops.jar bootcamp-devops.jar
ENTRYPOINT ["java", "jar", "/bootcamp-devops.jar"]