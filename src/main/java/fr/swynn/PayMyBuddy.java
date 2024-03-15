package fr.swynn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "fr.swynn.controllers")
public class PayMyBuddy {

    public static void main(String[] args) {
        SpringApplication.run(PayMyBuddy.class, args);
    }
}