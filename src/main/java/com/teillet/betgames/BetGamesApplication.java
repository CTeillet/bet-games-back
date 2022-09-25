package com.teillet.betgames;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEncryptableProperties
public class BetGamesApplication {

    public static void main(String[] args) {
        SpringApplication.run(BetGamesApplication.class, args);
    }

}
