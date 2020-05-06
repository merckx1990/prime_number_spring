FROM openjdk:8

EXPOSE 9998

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} primeNumber.jar
ENTRYPOINT ["java","-jar","/primeNumber.jar"]