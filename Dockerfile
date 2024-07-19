FROM maven

# Copy the source code
COPY . /usr/src/app

# Set the working directory
WORKDIR /usr/src/app

# Build the application
RUN mvn clean install

# Run the application
CMD ["mvn", "spring-boot:run"]

# Expose the port
EXPOSE 80