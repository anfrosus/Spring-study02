package com.example.spring_hw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringHwApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringHwApplication.class, args);
	}

}
