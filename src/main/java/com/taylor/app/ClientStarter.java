package com.taylor.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@RestController
@EnableSwagger2
public class ClientStarter {
    @Value("${name}")
    String bar;

    @RequestMapping("/")
    String hello() {
        return "Hello " + bar + "!" ;
    }

    public static void main(String... args) {

        SpringApplication.run(ClientStarter.class, args);

    }
}