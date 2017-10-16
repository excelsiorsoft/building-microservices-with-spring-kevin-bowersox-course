# Service Registry and Discovery with Eureka

Use **Eureka** working set in Eclipse

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


- Accessing via Netflix API:

![https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/service-registry-and-discovery-with-eureka/eureka-client2-netflix-api.PNG](https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/service-registry-and-discovery-with-eureka/eureka-client2-netflix-api.PNG)


- Hit /serviceInfo endpoint on Eureka-client-2:

![https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/service-registry-and-discovery-with-eureka/Running%20dependent%20service.PNG](https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/service-registry-and-discovery-with-eureka/Running%20dependent%20service.PNG)


- Accessing via Spring's RestTemplate:

![https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/service-registry-and-discovery-with-eureka/eureka-rest-1.PNG](https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/service-registry-and-discovery-with-eureka/eureka-rest-1.PNG)

![https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/service-registry-and-discovery-with-eureka/eureka-rest-2.PNG](https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/service-registry-and-discovery-with-eureka/eureka-rest-2.PNG)

![https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/service-registry-and-discovery-with-eureka/eureka-rest-3.PNG](https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/service-registry-and-discovery-with-eureka/eureka-rest-3.PNG)

- Hit /execute endpoint on Eureka-client:

![https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/service-registry-and-discovery-with-eureka/eureka-rest-4.PNG](https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/service-registry-and-discovery-with-eureka/eureka-rest-4.PNG)

-------------------------

# Extra Curriculum Reading

Overview of different service discovery mechanisms. [here](http://daviddawson.me/getting/started/with/microservices/2015/06/10/service-discovery-overview.html), [here](https://coreos.com/blog/performance-of-etcd.html) and [here](https://workmarket.tech/choosing-a-service-discovery-system-1979ee55c728).

Eureka doesn't [support](https://github.com/spring-cloud/spring-cloud-netflix/issues/846) Jersey 2

Communications among peers within Eureka server cluster is described [here](https://github.com/Netflix/eureka/wiki/Understanding-Eureka-Peer-to-Peer-Communication).


Configuring Spring Cloud Eureka on AWS is documented [here](https://stackoverflow.com/questions/42547845/spring-cloud-netflix-eureka-aws-deployment) and [here](https://www.slideshare.net/ToddMiller34/spring-cloud-into-production).

Eureka vs Zookeeper comparison: [here](https://tech.knewton.com/blog/2014/12/eureka-shouldnt-use-zookeeper-service-discovery/) and [here](https://groups.google.com/forum/#!topic/consul-tool/bw6q52acNjM).

Consul vs Eureka comparison [https://www.consul.io/intro/vs/eureka.html](https://www.consul.io/intro/vs/eureka.html) and [here](https://github.com/hashicorp/consul/issues/1295).





