FROM openjdk:17-alpine

WORKDIR /home/java-app

COPY ./target/*.jar app.jar

CMD ["java","-jar","app.jar"]