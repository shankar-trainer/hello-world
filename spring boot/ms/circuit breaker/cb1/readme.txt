start eureka-server, product from microservice

from cb1 start app


http://localhost:5050/productorder/52
start and check
localhost:5050/actuator/health

 it will show product{
 "state":closed
 }

now stop product

then


call http://localhost:5050/productorder/52 API 3 times ,
then refresh the actuator link localhost:5050/actuator/health
now Circuit Breaker was  triggered. the reason is that failureRate is now greater than failure-rate-threshold.


Wait for 5 seconds, refresh the actuator link localhost:5050/actuator/health, and well see Circuit
Breaker now is in HALF_OPEN state.


During HALF_OPEN state, it allows permitted-number-of-calls-in-half-open-state requests (We configured its value
as 3), then calculates the failure rate again, If the failure rate is still greater than failure-rate-threshold,
Circuit Breaker will be triggered again. Continue calling order-service API 3 times
http://localhost:5050/productorder/52, then refresh the actuator link localhost:5050/actuator/health
        "status": "CIRCUIT_OPEN",  // // CircuitBreaker is triggered again
          "state": "OPEN"


Now run product, then continue calling order-service API 3 times
http://localhost:5050/productorder/52
, refresh the actuator link
localhost:5050/actuator/health. well see Circuit Breaker was closed.







localhost:5050/actuator/health
