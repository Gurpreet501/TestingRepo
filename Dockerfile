FROM openjdk:8
ADD target/TestingRepo.jar TestingRepo.jar
EXPOSE 9001
ENTRYPOINT  ["java","-jar","/TestingRepo.jar"]