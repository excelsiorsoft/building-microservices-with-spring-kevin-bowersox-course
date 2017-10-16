# Load balancing with Ribbon

**Ribbon** working set in Eclipse contains all relevant projects.

Create 3 instances of the same service (simple-service2) running on 3 different ports: 4444, 5555, 6666:

![https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/client-side-load-balancing-with-ribbon/3%20instances.PNG](https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/client-side-load-balancing-with-ribbon/3%20instances.PNG)

Provide the Ribbon client microservice with appropriate configurations (see its *application.properties* and *RibbonApplication.java* for details.

![https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/client-side-load-balancing-with-ribbon/ribbon-client-config-1.PNG](https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/client-side-load-balancing-with-ribbon/ribbon-client-config-1.PNG)

![https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/client-side-load-balancing-with-ribbon/ribbon-client-config-2.PNG](https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/client-side-load-balancing-with-ribbon/ribbon-client-config-2.PNG)

Start the 3 instances of *simple-service-2* via Eclipse run configurations specified above as well as *ribbon* client microservice and invoke the /startClient endpoint:

![https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/client-side-load-balancing-with-ribbon/run%20and%20invoke.PNG](https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/client-side-load-balancing-with-ribbon/run%20and%20invoke.PNG)