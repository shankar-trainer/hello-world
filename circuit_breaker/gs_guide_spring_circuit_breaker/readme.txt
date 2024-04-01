Run both the Bookstore service and the Reading service and then open a browser to the Reading service at localhost:8080/to-read. You should see the complete recommended reading list:

Spring in Action (Manning), Cloud Native Java (O'Reilly), Learning Spring Boot (Packt)
Now shut down the Bookstore application. Our list source is gone, but, thanks to Hystrix and Spring Cloud Netflix, we have a reliable abbreviated list to stand in the gap. You should see:

Cloud Native Java (O'Reilly)
