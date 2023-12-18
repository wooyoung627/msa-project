package com.apps.appproduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AppProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppProductApplication.class, args);
    }

}
