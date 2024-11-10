package com.saas.billing;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.saas")
@EnableJpaRepositories(basePackages = "com.saas.billing")
@EntityScan(basePackages = "com.saas")

public class BillingApplication {

    public static void main(String[] args) {
//        log.info("Application Started");
        SpringApplication.run(BillingApplication.class, args);
        System.out.println("Application Started");
    }

}
