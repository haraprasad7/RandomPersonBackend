package com.app.RandomPerson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.app.*"})
public class RandomPersonApplication {

	public static void main(String[] args) {
		SpringApplication.run(RandomPersonApplication.class, args);
	}

}
