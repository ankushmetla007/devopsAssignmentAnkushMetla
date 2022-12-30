FROM openjdk:11
EXPOSE 9093
ADD target/demo-nagarro.jar demo-nagarro.jar
ENTRYPOINT ["java","-jar","/demo-nagarro.jar"]