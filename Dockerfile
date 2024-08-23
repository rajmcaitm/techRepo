FROM openjdk:11
EXPOSE 8080
ADD target/SpringBootCRUDWithSplunkIntegration-1.0.0.jar SpringBootCRUDWithSplunkIntegration-2.0.0.jar
ENTRYPOINT ["java","-jar","/SpringBootCRUDWithSplunkIntegration-2.0.0.jar"]