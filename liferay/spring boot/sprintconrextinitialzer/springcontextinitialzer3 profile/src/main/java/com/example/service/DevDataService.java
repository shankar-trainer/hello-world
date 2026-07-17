package com.example.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
public class DevDataService implements DataService {
    @Override
    public String getDataSourceName() {
        return "Connected to Local H2 Database (Dev Environment)";
    }
}