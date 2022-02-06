# About Project

This is a simple Spring Boot application which, when accessed via /states or /state?name=statename REST endpoint show
all or specific Indian states and their capitals. This application uses an in-memory H2 database that inserts rows at
the startup and keeps it in memory.

# About Skaffold

> Skaffold handles the workflow for building, pushing and deploying your application.

# How to start project locally

* Install skaffold   `brew install skaffold` [Mac]  or  `choco install skaffold` [Windows]  
* Install Docker Desktop for [Mac](https://www.docker.com/products/docker-desktop) for running kubernetes locally
* Install kubectl (Optional for Docker Desktop)  `brew install kubectl`  [Mac]  or  `choco install kubectl-cli docker-cli` [Windows]  

`git clone https://github.com/yrashish/indian-states`

`skaffold dev`

# Demo

[![Demo](https://img.youtube.com/vi/KR8DqxaOGBw/2.jpg)](https://www.youtube.com/watch?v=KR8DqxaOGBw)

# If Using Minikube

```bash
eval $(minikube docker-env)
export nodePort=$( kubectl get svc skaffold-introduction   -o json | jq -r ".spec.ports[0].nodePort" )
curl $(minikube ip):$nodePort/states  |jq -r

[
  {
    "name": "Andra Pradesh",
    "capital": "Hyderabad"
  },
  {
    "name": "Arunachal Pradesh",
    "capital": "Itangar"
  },
  {
...(ommit)
```
Indeed we are getting the expected output. Let's hit the other /state?name=statename REST endpoint as well and see if we are getting
the desired output or not, as follows:
```bash
$ eval $(minikube docker-env)
$ export nodePort=$( kubectl get svc skaffold-introduction   -o json | jq -r ".spec.ports[0].nodePort" )
$ curl $(minikube ip):$nodePort/states  |jq -r
$ curl -X GET "$(minikube ip):$nodePort/states?name=Karnataka"
Bengaluru
```