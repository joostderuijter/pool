# Start minikube
minikube start

# Set docker env
eval $(minikube docker-env)

# Run in Minikube
kubectl run --image=person-api:latest --image-pull-policy=Never

# Check that it's running
kubectl get pods