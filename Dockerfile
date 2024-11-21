FROM amazoncorretto:17-alpine-jdk
MAINTAINER ESMERALDA
COPY target/TF-0.0.1-SNAPSHOT.jar TrabajoParcialBackend.jar
ENTRYPOINT ["java", "-jar", "/TrabajoParcialBackend.jar"]