package com.javaguide.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableJpaRepositories("com.javaguide.respository")
@ComponentScan(basePackages = {"com.javaguide.controller","com.javaguide.service"})
@EntityScan("com.javaguide.model")
@EnableAutoConfiguration
public class JavapointApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavapointApplication.class, args);
	}

}
