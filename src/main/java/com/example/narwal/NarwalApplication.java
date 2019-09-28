package com.example.narwal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.example.narwal.persistence.repository")
@EntityScan("com.example.narwal.persistence.model")
@SpringBootApplication
public class NarwalApplication {

	public static void main(String[] args) {

		SpringApplication.run(NarwalApplication.class, args);
	}

}
