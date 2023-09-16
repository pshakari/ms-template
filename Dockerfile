From openjdk:21-ea-slim-bookworm
run gradle clean build
copy ./build/libs/ms-template-0.0.1-SNAPSHOT.jar ms-template-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","ms-template-0.0.1-SNAPSHOT.jar"]