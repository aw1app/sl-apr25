package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@ComponentScan(basePackages = {"com.example.controller", "com.example.repositry"})
//@EntityScan({"com.example.entity"})
@EnableJpaRepositories
@SpringBootApplication
public class SpringDataJpaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaDemoApplication.class, args);
	}

}
