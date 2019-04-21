# Simple Spring Boot microservice deployed in Kubernetes using Docker and Nexus 
This is the repository for the following stories:  
    - https://medium.com/@simionrazvan/simple-spring-boot-microservice-deployed-in-kubernetes-using-docker-and-nexus-part-1-b581e3ca8916
    - https://medium.com/@simionrazvan/simple-spring-boot-microservice-deployed-in-kubernetes-using-docker-and-nexus-part-2-25dc2a3982cf

# Build Jar

gradlew clean bootJar

# Build docker

OBS: You must configure local docker daemon: Insecure regiestries:  [nexus ip]:[nexus port]

gradlew clean bootJar jib

# Run docker
docker login [nexus ip]:[nexus port]
docker run -d -p 8080:8080 [nexus ip]:[nexus port]/spring-microservice-docker:[version]

# Run Kubernetes
## Create secret to authenticate to private docker registry
kubectl create secret docker-registry trccred --docker-server=[repository ip]:[repository port] --docker-username=[username] --docker-password=[user password] --docker-email=[user email]

## Optional - Export secret
kubectl get secret trccred --output=yaml

## Service start
minikube service spring-microservice

## Deploy to Kubernetes
kubectl apply -f ./kubernetes/


