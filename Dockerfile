FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} billing-0.0.1-SNAPSHOT.jar
EXPOSE 80
ENTRYPOINT ["java","-jar","/billing-0.0.1-SNAPSHOT.jar"]