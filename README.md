## spring-boot-kubernetes-demo

### Clone Repository  

```
$ git clone https://github.com/Youngerjesus/spring-boot-kubernetes-demo.git
```


### Deploy the Microservices

#### 1. Deploy Spring Boot Service1  

```
$ kubectl apply -f deployment1.yaml
```

<br/> 

```
$ kubectl apply -f service1.yaml
```

#### 2. Deploy Spring Boot Service2 

```
$ kubectl apply -f deployment2.yaml
```
<br/> 
```
$ kubectl apply -f service2.yaml
```

#### 3. Deploy ingress.yaml 

```
$ kubectl apply -f ingress.yaml
```




