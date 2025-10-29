package com.example.SpringBootProfile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(BuildInfoConfigration.class)
public class SpringBootProfileApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootProfileApplication.class, args);
    }

}
