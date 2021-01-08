package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.microsoft.azure.spring.cloud.feature.manager.FeatureManager;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@ConfigurationProperties("controller")
public class HelloController {

    private FeatureManager featureManager;

    public HelloController(FeatureManager featureManager) {
        this.featureManager = featureManager;
    }

    @GetMapping("/welcome")
    public String mainWithParam(Model model) {
        model.addAttribute("Beta", featureManager.isEnabledAsync("featureManagement.Beta").block());
        return "welcome";
    }
}