package com.example.SpringBootProfile;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "build")
@Data
public class BuildInfoConfigration {
    private String id;
    private String version;
    private String name;
}
