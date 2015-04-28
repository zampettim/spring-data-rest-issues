package com.example.sdr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.hateoas.config.EnableEntityLinks;

@SpringBootApplication
@EnableEntityLinks
public class Application {

    /**
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

    }

}
