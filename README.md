#spring-sockjs-stomp
===================

##Download and Maven it

```
spring-sockjs-stomp$ mvn install eclipse:eclipse #or if you use IntelliJ...
```

Open the project on your flavored IDE and run the ```br.com.foo.Aplication``` class as a java application. This
project uses Spring Boot, so this will start a local server listening http requests to port 8080.

Go to ```http://localhost:8080```

You'll see two topics: foo and bar. If the status is not ```CONNECTED``` something is wrong. Make sure you're using the latest
versions of JDK7 and maven 3.

Click 'subscribe' to receive messages from the chosen topic.

Open another browser. Issuing GET requests to ```http://localhost:8080/updateFoo``` will send updates to foo subscribers and ```http://localhost:8080/updateBar``` to bar's ones.

Enjoy! Any comments, fell free to get in touch!
