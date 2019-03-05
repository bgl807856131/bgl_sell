package com.bgl.sell;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan(basePackages = "com.sell.dataobject.mapper")
@EnableCaching
public class BGLSellApplication {

	public static void main(String[] args) {
		SpringApplication.run(BGLSellApplication.class, args);
	}
}
