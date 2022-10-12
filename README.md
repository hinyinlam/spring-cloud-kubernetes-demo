Demo for Spring-Cloud-Kubernetes
===

This is a simple demo for pre-sales activities showing the use cases of Cloud Native App in K8S using Spring Cloud Kubernetes. 

What's included in this demo?
---
1. PropertySource using ConfigMap 
2. PodHealth and Actuator for K8S (Liveness/Readiness)

How's the folder structure?
---
k8s/ <-- Script and YAML for deploy into minikube

src/ <-- Spring Boot app with Spring-Cloud-Kubernetes support

Where should I look into?
---
Mainly the actuator endpoint:
1. /actuator/location <-- a custom actuator endpoint to read "location awareness info"
2. `kubectl logs -f deploy/spring-k8s-demo`   <-- See the ASCII banner if it's "Local" or "K8S"

How to build?
---
Look inside and run `./k8s/redeployToMinikube.sh` in project root