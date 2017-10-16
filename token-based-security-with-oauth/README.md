# Token-based security with OAuth

**OAuth** working set in Eclipse contains all relevant projects.

# Establish an Authorization Server

- oauth-server project

Authorization and Web Security Configuration for Spring:

![https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/token-based-security-with-oauth/auth-config.PNG](https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/token-based-security-with-oauth/auth-config.PNG)

![https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/token-based-security-with-oauth/web-security-config.PNG](https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/token-based-security-with-oauth/web-security-config.PNG)

# Stand up the server and run query against it to gain access token: 

- in Postman:

![https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/token-based-security-with-oauth/postman-oauth-token.PNG](https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/token-based-security-with-oauth/postman-oauth-token.PNG)

- in Curl: 

![https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/token-based-security-with-oauth/curl-oauth-token.PNG](https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/token-based-security-with-oauth/curl-oauth-token.PNG)

# Establish a Resource Server

- oauth-server project

![https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/token-based-security-with-oauth/config-resource-server.PNG](https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/token-based-security-with-oauth/config-resource-server.PNG)

