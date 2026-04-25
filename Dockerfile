FROM openjdk:27-ea-oraclelinux9
COPY target/springboot-api-eks-hello-0.0.1-SNAPSHOT.jar app.jar
CMD ["java", "-jar", "app.jar", "--debug"]