FROM openjdk:8
EXPOSE 8080
ADD target/springbootcrudwithsplunkintegration.jar springbootcrudwithsplunkintegration.jar
ENTRYPOINT ["java","-jar","/springbootcrudwithsplunkintegration.jar"]