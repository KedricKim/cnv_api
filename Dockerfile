FROM adoptopenjdk/openjdk11:latest

# Add Author info
LABEL maintainer="kedric.me@gmail.com"

# Add a volume to /tmp
VOLUME /tmp

# Make port 8080 available to the world outside this container
EXPOSE 8070 

# The application's jar file
ARG JAR_FILE=build/libs/cnv-0.0.1-SNAPSHOT.jar 

# Add the application's jar to the container
ADD ${JAR_FILE} cnv.jar

# Run the jar file

ENTRYPOINT ["java","-jar","/cnv.jar"]