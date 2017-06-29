package com.taylor.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@RestController
@EnableSwagger2
@EnableEurekaClient
public class ClientStarter {

    @Value("${content}")
    private String content;

    @Value("${name}")
    private String bar;

    @RequestMapping("/")
    String hello() {

        return "Hello " + bar + "!"+content;
    }
    @RequestMapping("/hello")
    String helloString() {
        return "Hello " + bar + "!"+content;
    }

    public static void main(String... args) {

        SpringApplication.run(ClientStarter.class, args);

    }
}