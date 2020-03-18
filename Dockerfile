FROM openjdk:8-alpine
EXPOSE 8103
ADD ./target/demoSpringBootOpenShift-0.0.1-SNAPSHOT.jar demoSpringBootOpenShift-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","demoSpringBootOpenShift-0.0.1-SNAPSHOT.jar"]
