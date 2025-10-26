/*
package com.example.service;
import com.example.feign.UserClient;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserClient userClient;

    public UserService(UserClient userClient) {
        this.userClient = userClient;
    }

    @CircuitBreaker(name = "userService", fallbackMethod = "fallbackUserData")
    public String getUserData(String userId) {
        return userClient.getUserById(userId);
    }

    public String fallbackUserData(String userId, Throwable throwable) {
        return "Default user data for user " + userId + " due to service unavailability";
    }
}
*/
