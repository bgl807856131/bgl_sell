package com.bgl.sell;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class BGLSellApplication {

	public static void main(String[] args) {
		SpringApplication.run(BGLSellApplication.class, args);
	}
}
