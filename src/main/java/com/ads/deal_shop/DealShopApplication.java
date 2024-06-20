package com.ads.deal_shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.ads.deal_shop.model")
@EnableJpaRepositories(basePackages = "com.ads.deal_shop.repository")
public class DealShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(DealShopApplication.class, args);
    }
}
