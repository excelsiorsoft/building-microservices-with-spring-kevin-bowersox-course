# Token-based security with OAuth

**OAuth** working set in Eclipse contains all relevant projects.

# Establish an Authorization Server

- oauth-server project (via @EnableAuthorizationServer)

Authorization and Web Security Configuration for Spring:

![https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/token-based-security-with-oauth/auth-config.PNG](https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/token-based-security-with-oauth/auth-config.PNG)

![https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/token-based-security-with-oauth/web-security-config.PNG](https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/token-based-security-with-oauth/web-security-config.PNG)

# Stand up the server and run query against it to gain access token: 

- in Postman:

![https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/token-based-security-with-oauth/postman-oauth-token.PNG](https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/token-based-security-with-oauth/postman-oauth-token.PNG)

- in Curl: 

![https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/token-based-security-with-oauth/curl-oauth-token.PNG](https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/token-based-security-with-oauth/curl-oauth-token.PNG)

# Establish a Resource Server

- oauth-server project (via @EnableResourceServer)

![https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/token-based-security-with-oauth/config-resource-server.PNG](https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/token-based-security-with-oauth/config-resource-server.PNG)

# Same access token (from above) can now be used for resource aquisition:

![https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/token-based-security-with-oauth/resource-acuisition-1.PNG](https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/token-based-security-with-oauth/resource-acuisition-1.PNG)

or in curl:


![https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/token-based-security-with-oauth/resource-acuisition-2.PNG](https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/token-based-security-with-oauth/resource-acuisition-2.PNG)

Thus, Resource Server accepts access token issued by the Authentication Server due to the relationship between the 2 servers within out OAuth authentication scheme.

---

# We can protect the endpoint  (via @EnableGlobalMethodSecurity) by discerning who is able to access it:

![https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/token-based-security-with-oauth/global-method-protection.PNG](https://github.com/excelsiorsoft/building-microservices-with-spring-kevin-bowersox-course/blob/master/token-based-security-with-oauth/global-method-protection.PNG)




