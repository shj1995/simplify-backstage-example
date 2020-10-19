# Use the official image as a parent image.
FROM java:8

# Set the working directory.
# WORKDIR /

# Copy the file from your host to your current location.
COPY ./target/simplify-backstage-example-0.0.1-SNAPSHOT.jar ./app.jar

# Run the command inside your image filesystem.
#RUN npm install

# Inform Docker that the container is listening on the specified port at runtime.
EXPOSE 8080

# Run the specified command within the container.
CMD [ "java", "-jar","app.jar" ]
