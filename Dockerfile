FROM eclipse-temurin:17
LABEL mentainer="cristopher.vergara.colombo@outlook.com"
WORKDIR /app
COPY target/springboot-restful-webservices-0.0.1-SNAPSHOT.jar /app/springboot-restful-webservices.jar
ENTRYPOINT ["java" , "-jar", "springboot-restful-webservices.jar"]