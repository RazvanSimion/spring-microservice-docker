# Build Jar

gradlew clean bootJar

# Build docker

OBS: You must configure local docker daemon: Insecure regiestries:  [nexus ip]:[nexus port]

gradlew clean bootJar jib

# Run docker
docker login [nexus ip]:[nexus port]
docker run -d -p 8080:8080 [nexus ip]:[nexus port]/spring-microservice-docker:[version]

