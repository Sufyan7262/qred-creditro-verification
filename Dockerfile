FROM openjdk:8-jdk-alpine
ADD target/creditro-data-verification-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar
VOLUME /tmp