# Circuit Breaking, Fault Tolerance and Health Monitoring with Hystrix

**Hystrix** working set in Eclipse contains all relevant projects.

- Start simple-service microservice project
- Start hystrix microservice project

Absence of fault condition, circuit is closed: ![closed:](https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/curcuit-breaker-fault-tolerance-with-hystrix/circuit-closed.PNG)

- Kill simple-service

Presence of fault condition, circuit is open: ![open:](https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/curcuit-breaker-fault-tolerance-with-hystrix/circuit-open.PNG)

- Restart simple-service

Absence of fault condition, circuit is closed again: ![closed:](https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/curcuit-breaker-fault-tolerance-with-hystrix/circuit-closed.PNG)


- Adding timeout to HystrixCommand: 

```
@SuppressWarnings("unchecked")
	@RequestMapping("/startClient")
	@HystrixCommand(fallbackMethod="failover", commandProperties= {
			@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "500")
	})
	public List<String> startClient(@RequestParam long time) throws InterruptedException{
		Thread.sleep(time);
		return restTemplate.getForObject("http://localhost:8899/service", List.class);
	}
	
	public List<String> failover(long time){
		return Arrays.asList("Default1", "Default2");
	}
```

![https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/curcuit-breaker-fault-tolerance-with-hystrix/timing.PNG](https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/curcuit-breaker-fault-tolerance-with-hystrix/timing.PNG)

A bit more explanation of the timeout behavior is given [here](https://stackoverflow.com/questions/38524259/hystrix-configuration).

All the rest of the Hystrix configuration commands are found [here](https://github.com/Netflix/Hystrix/wiki/Configuration).


To enable Hystrix dashboard functionality (@EnableHystrixDashboard) within a project, add the following to the pom.xml:

```
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-actuator</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-hystrix-dashboard</artifactId>
		</dependency>
```

A bit more details on Hystrix & dashboarding are [here](http://www.baeldung.com/spring-cloud-netflix-hystrix) and [here](https://fernandoabcampos.wordpress.com/category/enablehystrixdashboard/).

Playing with Hystrix Dashboard:

Generate traffic stream:

![https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/curcuit-breaker-fault-tolerance-with-hystrix/hystrix-stream-1.PNG](https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/curcuit-breaker-fault-tolerance-with-hystrix/hystrix-stream-1.PNG)

Observer the stream:

![https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/curcuit-breaker-fault-tolerance-with-hystrix/hystrix-stream-2.PNG](https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/curcuit-breaker-fault-tolerance-with-hystrix/hystrix-stream-2.PNG)

Configure Hystrix Dashboard with stream URL:

![https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/curcuit-breaker-fault-tolerance-with-hystrix/hystrix-stream-3.PNG](https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/curcuit-breaker-fault-tolerance-with-hystrix/hystrix-stream-3.PNG)

Visualize the state of our distributed system:

![https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/curcuit-breaker-fault-tolerance-with-hystrix/hystrix-stream-4.PNG](https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/curcuit-breaker-fault-tolerance-with-hystrix/hystrix-stream-4.PNG)

![https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/curcuit-breaker-fault-tolerance-with-hystrix/hystrix-stream-5.PNG](https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/curcuit-breaker-fault-tolerance-with-hystrix/hystrix-stream-5.PNG)