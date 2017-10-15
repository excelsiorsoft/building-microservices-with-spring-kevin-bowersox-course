# Service Registry and Discovery with Eureka

Server Side
----------------

- Enable Eureka Server:

![Enable Eureka Server](https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/service-registry-and-discovery-with-eureka/Enabling%20Eureka.png)

- Start Eureka Server:

![Starting Eureka Server](https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/service-registry-and-discovery-with-eureka/starting%20Eureka%20server%20app.png)

- Access Eureka Dashboard:

![Access Eureka Dashboard](https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/service-registry-and-discovery-with-eureka/pristine%20Eureka%20server.PNG)

Running Redundant Eureka Servers:
-------------------------------------

- Modify hosts file:

![https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/service-registry-and-discovery-with-eureka/hosts.png](https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/service-registry-and-discovery-with-eureka/hosts.png)
				
- Enable Spring profiles:

![https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/service-registry-and-discovery-with-eureka/ereka%20server%20profiles.PNG](https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/service-registry-and-discovery-with-eureka/ereka%20server%20profiles.PNG)

- Create run configurations:

![https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/service-registry-and-discovery-with-eureka/run%20configs.PNG](https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/service-registry-and-discovery-with-eureka/run%20configs.PNG)

- Observe Dashboard for Both Replicas:

![https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/service-registry-and-discovery-with-eureka/replica%20%231.PNG](https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/service-registry-and-discovery-with-eureka/replica%20%231.PNG)


![https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/service-registry-and-discovery-with-eureka/replica%20%232.PNG](https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/service-registry-and-discovery-with-eureka/replica%20%232.PNG)

Client Side
----------------

- Enable Eureka Client:

![ ](https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/service-registry-and-discovery-with-eureka/eureka%20client.png)

- Multi-service Architecture:

![https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/service-registry-and-discovery-with-eureka/Architecture.png](https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/service-registry-and-discovery-with-eureka/Architecture.png)

![https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/service-registry-and-discovery-with-eureka/Inter-service%20dependency.PNG](https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/service-registry-and-discovery-with-eureka/Inter-service%20dependency.PNG)

- Observe the Dashboard:

![https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/service-registry-and-discovery-with-eureka/multi-service%20dashboard.PNG](https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/service-registry-and-discovery-with-eureka/multi-service%20dashboard.PNG)

- Hit /serviceInfo endpoint on Eureka-client-2:

![https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/service-registry-and-discovery-with-eureka/Running%20dependent%20service.PNG](https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/service-registry-and-discovery-with-eureka/Running%20dependent%20service.PNG)





