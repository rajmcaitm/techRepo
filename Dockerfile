FROM openjdk:8
EXPOSE 8080
ADD target/springbootcrudwithsplunkintegration-images.jar springbootcrudwithsplunkintegration-images.jar
ENTRYPOINT ["java","-jar","/springbootcrudwithsplunkintegration-images.jar"]