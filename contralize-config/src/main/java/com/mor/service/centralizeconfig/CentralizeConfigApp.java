package com.mor.service.centralizeconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CentralizeConfigApp {
    public static void main(String[] args) {
        SpringApplication.run(CentralizeConfigApp.class, args);
    }
}
