package com.example.limitsservice;

import com.example.bean.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    @Autowired
    Configuration configuration;

    @GetMapping("/limits")
    public LimitConfiguration retrieveLimitConfiguration(){
        LimitConfiguration limitConfiguration=new LimitConfiguration(configuration.getMaximum(),configuration.getMinimum());
        return  limitConfiguration;
    }
}
