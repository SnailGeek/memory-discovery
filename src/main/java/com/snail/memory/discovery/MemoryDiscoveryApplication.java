package com.snail.memory.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MemoryDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(MemoryDiscoveryApplication.class, args);
    }

}

