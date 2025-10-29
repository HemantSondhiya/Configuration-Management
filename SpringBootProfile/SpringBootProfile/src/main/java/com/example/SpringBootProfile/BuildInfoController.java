package com.example.SpringBootProfile;

import lombok.AllArgsConstructor;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RefreshScope
@AllArgsConstructor
public class BuildInfoController {

    private BuildInfoConfigration buildInfoConfigration;

    @GetMapping("/buildInfo")
    public String getBuildInfo(){
        return "BuildId: " + buildInfoConfigration.getId() +
                ", BuildVersion: " + buildInfoConfigration.getVersion() +
                ", BuildName: " + buildInfoConfigration.getName();
    }
}
