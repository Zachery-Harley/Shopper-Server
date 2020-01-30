FROM openjdk:latest

ADD target/quick-list-server.jar /apps/java/quick-list-server.jar

ENTRYPOINT ["java", "-jar", "/apps/java/quick-list-server.jar"]