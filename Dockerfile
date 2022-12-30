FROM openjdk:11
EXPOSE 9093
COPY target/demo-nagarro.jar demo-nagarro.jar
ENTRYPOINT ["java","-jar","/demo-nagarro.jar"]