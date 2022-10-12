#!/bin/bash

SCRIPT_PATH=$(dirname "$0")

eval $(minikube -p minikube docker-env);
./mvnw clean spring-boot:build-image;

kubectl delete -f "$SCRIPT_PATH"/k8s-spring-configmap.yaml;
kubectl create -f "$SCRIPT_PATH"/k8s-spring-configmap.yaml;
kubectl delete -f "$SCRIPT_PATH"/spring-k8s-demo-deployment.yaml;
kubectl create -f "$SCRIPT_PATH"/spring-k8s-demo-deployment.yaml;
