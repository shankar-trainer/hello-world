https://salithachathuranga94.medium.com/micro-service-patterns-circuit-breaker-with-spring-boot-253e4a829f94

http://localhost:9000/api/rates/PERSONAL
http://localhost:9000/api/rates/HOUSING

http://localhost:8000/api/loans?type=personal

Enable Circuit Breaker with fallback method
http://localhost:8000/actuator/health

Start both micro services. Loan service is running on 8000 and Rate service is running on 9000.
Now hit this API 2 times: http://localhost:8000/api/loans?type=personal.
Then go and check the actuator: http://localhost:8000/actuator/health.
Now bufferedCalls count has been updated into 2 as expected.
Still breaker is CLOSED since rate service is UP.


STOP the rate-service!!
Then hit loan service API URL 3 times: http://localhost:8000/api/loans?type=personal.
You should get an empty array we setup as fallback!
This will lead bufferedCalls count to 5(Previous 2 and this 3)

 At the same time, failedCalls count is updated into 3. Right?? Now failureRate becomes 60%( (3/5) * 100% ).
 Then it has exceeded our threshold: 50%.
 Then the circuit breaker changes its state to OPEN!
