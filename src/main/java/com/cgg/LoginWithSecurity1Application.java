package com.cgg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@ComponentScan(basePackages="com.cgg")
@SpringBootApplication(exclude= {SecurityAutoConfiguration.class})
public class LoginWithSecurity1Application {

	public static void main(String[] args) {
		SpringApplication.run(LoginWithSecurity1Application.class, args);
	}
	
	@Bean
	public BCryptPasswordEncoder enc() {
		return new BCryptPasswordEncoder();
	}
}
