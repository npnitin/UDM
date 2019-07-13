package com.example.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("limits-service")
public class LimitsController {

    /*@Value("${limits-service.minimum}")
    private int minimum;

    @Value("${limits-service.maximum}")
    private int maximum;*/

    @Autowired
    private Config config;


    @GetMapping
    public LimitsConfiguration getConfiguration(){
        return new LimitsConfiguration(config.getMinimum(),config.getMaximum());
    }
}
