FROM openjdk:11
COPY ./target/Scitefic_calcultor-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "Scitefic_calcultor-1.0-SNAPSHOT-jar-with-dependencies.jar"]