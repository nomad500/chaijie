package com.nomad.nomadspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class NomadspringApplication {

    public static void main(String[] args) {
        SpringApplication.run(NomadspringApplication.class, args);
    }

    @RequestMapping("/1")
    String home() {
        System.out.println("oo op");
        return "index";
    }

}
