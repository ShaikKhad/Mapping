package com.jsp.SpringbootonetooneMapping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.jsp.SpringbootonetooneMapping")
@ComponentScan(basePackages = "com.jsp.SpringbootonetooneMapping.User")
@ComponentScan(basePackages = "com.jsp.SpringbootonetooneMapping.Profile")
public class SpringbootonetooneMappingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootonetooneMappingApplication.class, args);
	}

}
