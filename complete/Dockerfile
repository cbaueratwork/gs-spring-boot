FROM openjdk:8
COPY target/gs-spring-boot-0.1.0.jar /app.jar

### Begin CDBG Config
# Remove the contents if they exist
RUN rm -rf /opt/cdbg/*

# Create the directory
RUN mkdir /opt/cdbg

# Download and extract the image
RUN wget -qO- https://storage.googleapis.com/cloud-debugger/compute-java/debian-wheezy/cdbg_java_agent_gce.tar.gz | tar xvz -C /opt/cdbg

# Remove the dev debugger agent archive file that we just extracted.
RUN rm -rf /opt/cdbg/cdbg_java_agent.tar.gz
### End CDBG Config


EXPOSE 8080/tcp
ENTRYPOINT ["java", "-agentpath:/opt/cdbg/cdbg_java_agent.so", "-Dcom.google.cdbg.module=spring-hello-world", "-Dcom.google.cdbg.version=1.0.0", "-jar", "/app.jar"]
