package com.example.like.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class LikeGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(LikeGatewayApplication.class, args);
    }

}
