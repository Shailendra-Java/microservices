# Spring Cloud Microservices
## Steps to create Eureka Naming Server
1. Create Spring Starter Project
2. Spring Boot Version >= 2.0.0
3. Dependencies 
  - Eureka Server
  - Actuator
  - DevTools
4. Modify Application.properties
  - server.port=8761
  - eureka.client.register-with-eureka=false
5. Add annotation @EnableEurekaServer to EurekaApplication.java

## Steps to create microservice
1. Create Spring Starter Project
2. Spring Boot Version >= 2.0.0
3. Dependencies 
  - Eureka Discovery (For Service Registration)
  - Actuator (Monitor and Manage application)
  - DevTools (To auto reload the application when some chages occur)
  - JPA (To Save/Retriev Data)
  - H2  (an in-memory database)
  - Web (Spring MVC and embedded Tomcat)
  - Lombok (To reduce boilerplate code)
  - Rest Repository (To expose JPA repositories as REST endpoints)
4. Modify Application.properties
  - spring.application.name=item-catalog-service
  - server.port=8088
  
# Key Points about Microservices

### Feign Client
  Feign is a declarative web service client. It makes writing web service clients easier. To use Feign create an interface and annotate it. It has pluggable annotation support including Feign annotations and JAX-RS annotations. 
  
### Ribbon
  Ribbon is a client-side load balancer that gives you a lot of control over the behavior of HTTP and TCP clients. Feign already uses Ribbon, so, if you use @FeignClient, this section also applies.
  
### Eureka Naming Server
  Eureka Server is an application that holds the information about all client-service applications. Every Micro service will register into the Eureka server and Eureka server knows all the client applications running on each port and IP address. Eureka Server is also known as Discovery Server.
  
### Zuul API Gateway
  Zuul acts as an API gateway or Edge service. It receives all the requests coming from the UI and then delegates the requests to internal microservices. So, we have to create a brand new microservice which is Zuul-enabled, and this service sits on top of all other microservices. It acts as an Edge service or client-facing service. Its Service API should be exposed to the client/UI. The client calls this service as a proxy for an internal microservice, then this service delegates the request to the appropriate service.
  
### Zipkin Distributed Tracing
  Zipkin is an application for visualizing traces between and within services, their supporting components and even messaging. Zipkin originates from Twitter and is currently an open source project on GitHub. Zipkin provides a user-friendly GUI while the backend takes care of collecting tracing data and aggregating those into something we humans can make sense of.
  
### Spring Cloud Bus
  Spring Cloud Bus links nodes of a distributed system with a lightweight message broker. This can then be used to broadcast state changes (e.g. configuration changes) or other management instructions. The only implementation currently is with an AMQP broker as the transport, but the same basic feature set (and some more depending on the transport) is on the roadmap for other transports.
  
### Fault Tolerance with Hystrix
  Hystrix is watching methods for failing calls to related services. If there is such a failure, it will open the circuit and forward the call to a fallback method.


  
