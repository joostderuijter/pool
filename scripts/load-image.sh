# Set docker env
eval $(minikube docker-env)

# Scale down to 0
kubectl scale deployment person-api --replicas=0

# Rm old image
minikube image rm person-api

# Run in Minikube
minikube image load person-api:latest

# Check that it's running
kubectl get pods