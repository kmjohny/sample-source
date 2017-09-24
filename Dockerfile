FROM openjdk:8-jre-alpine

MAINTAINER UPMC-Enterprises

WORKDIR /opt/app/sample-source

COPY ./source-crt.pem /certs/source-crt.pem
COPY ./build/libs/sample-source-0.0.1-SNAPSHOT.jar sample-source-0.0.1-SNAPSHOT.jar

RUN keytool -import -file /certs/source-crt.pem -alias source -keystore $JAVA_HOME/lib/security/cacerts -storepass changeit -noprompt

CMD ["java","-jar","sample-source-0.0.1-SNAPSHOT.jar"]
