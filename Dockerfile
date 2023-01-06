FROM openjdk:11
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} zipkin.jar
ENTRYPOINT ["java","-jar","/zipkin.jar"]