package com.cricketmatch.result;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages="com.cricketmatch.result.repository")
@SpringBootApplication
@ComponentScan(basePackages = "com.cricketmatch.result")
public class CricketResultsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CricketResultsApplication.class, args);
	}

}
