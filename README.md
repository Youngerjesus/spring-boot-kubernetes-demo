## spring-boot-kubernetes-demo

### Clone Repository  

```
$ git clone https://github.com/Youngerjesus/spring-boot-kubernetes-demo.git
```


### Deploy the Microservices

#### 1. Deploy Frontend Service

```
$ kubectl apply -f frontend-service.yaml
```

#### 2. Deploy Spring Boot Service1 

```
$ kubectl apply -f service1.yaml
```

#### 3. Deploy Spring Boot Service2 
```
$ kubectl apply -f service2.yaml
```

#### 4. Deploy ingress.yaml 







