FROM openjdk:latest
ADD target/sampleservice*.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
EXPOSE 8081