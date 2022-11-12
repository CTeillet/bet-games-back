package com.teillet.betgames;

import com.teillet.betgames.config.CustomProperties;
import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableEncryptableProperties
@EnableConfigurationProperties({ CustomProperties.class })
public class BetGamesApplication {

    public static void main(String[] args) {
        SpringApplication.run(BetGamesApplication.class, args);
    }

}
