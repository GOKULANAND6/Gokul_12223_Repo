FROM openjdk:18
WORKDIR /app
COPY ./target/assessment-0.0.1-SNAPSHOT.jar /app
EXPOSE 8003
CMD ["java", "-jar", "assessment-0.0.1-SNAPSHOT.jar"]