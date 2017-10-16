# Circuit Breaking, Fault Tolerance and Health Monitoring with Hystrix

- Start simple-service microservice project
- Start hystrix microservice project

Absence of fault condition, circuit is closed: ![closed:](https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/curcuit-breaker-fault-tolerance-with-hystrix/circuit-closed.PNG)

- Kill simple-service

Presence of fault condition, circuit is open: ![open:](https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/curcuit-breaker-fault-tolerance-with-hystrix/circuit-open.PNG)

- Restart simple-service

Absence of fault condition, circuit is closed again: ![closed:](https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/curcuit-breaker-fault-tolerance-with-hystrix/circuit-closed.PNG)



