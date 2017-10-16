# Reverse Proxying with Zuul

**Zuul** working set in Eclipse contains all relevant projects.

- Microservice configuration:

![https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/edge-service-and-routing-with-zuul/service-config.PNG](https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/edge-service-and-routing-with-zuul/service-config.PNG)

- Executing microservice directly: 

![directly](https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/edge-service-and-routing-with-zuul/direct%20execution.PNG)

- Now, configure Zuul Reverse Proxy:

![https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/edge-service-and-routing-with-zuul/configure-1.PNG](https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/edge-service-and-routing-with-zuul/configure-1.PNG)

![https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/edge-service-and-routing-with-zuul/configure-2.PNG](https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/edge-service-and-routing-with-zuul/configure-2.PNG)

- Execute via Zuul Reverse Proxy: 

![https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/edge-service-and-routing-with-zuul/reverse-proxy%20execution.PNG](https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/edge-service-and-routing-with-zuul/reverse-proxy%20execution.PNG)

- Or with more explicit path configuration:

![https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/edge-service-and-routing-with-zuul/configure-3.PNG](https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/edge-service-and-routing-with-zuul/configure-3.PNG)

![https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/edge-service-and-routing-with-zuul/reverse-proxy%20execution.PNG](https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/edge-service-and-routing-with-zuul/reverse-proxy%20execution.PNG)

- Another remapping:

![https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/edge-service-and-routing-with-zuul/configure-4.PNG](https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/edge-service-and-routing-with-zuul/configure-4.PNG)

and its invocation:

![https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/edge-service-and-routing-with-zuul/remapped%20reverse-proxy%20execution.PNG](https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/edge-service-and-routing-with-zuul/remapped%20reverse-proxy%20execution.PNG)



-------------------------

# Extra-curriculum Reading:

A sample Spring application using Zuul: [https://spring.io/guides/gs/routing-and-filtering/](https://spring.io/guides/gs/routing-and-filtering/) and another one [here](https://piotrminkowski.wordpress.com/2017/02/05/part-1-creating-microservice-using-spring-cloud-eureka-and-zuul/). 

