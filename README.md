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
  
