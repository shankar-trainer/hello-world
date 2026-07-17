package com.example.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
public class ProdDataService implements com.example.service.DataService {
    @Override
    public String getDataSourceName() {
        return "Connected to Secure AWS RDS MySQL Instance (Production Environment)";
    }
}