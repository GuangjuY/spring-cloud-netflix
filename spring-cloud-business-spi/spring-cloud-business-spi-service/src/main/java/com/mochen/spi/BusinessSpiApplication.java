package com.mochen.spi;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BusinessSpiApplication {
    public static void main(String[] args) {
        SpringApplication.run(BusinessSpiApplication.class,args);
    }
}
