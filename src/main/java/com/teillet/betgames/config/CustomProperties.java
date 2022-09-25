package com.teillet.betgames.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "com.teillet.betgames")
public class CustomProperties {
    /**
     * The token to use to connect to the Pandascore API
     */
    String pandascoreToken;

    public String getPandascoreToken() {
        return pandascoreToken;
    }

    public void setPandascoreToken(String pandascoreToken) {
        this.pandascoreToken = pandascoreToken;
    }
}
