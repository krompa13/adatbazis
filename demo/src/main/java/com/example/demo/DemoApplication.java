package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(RendszergazdaRepository repository) {
		return args -> {
			Rendszergazda rendszergazda = new Rendszergazda(
					"Béla",
					"HD-31313",
					"04-04-1990"
			);


			repository.insert(rendszergazda);
		};
	}
	CommandLineRunner runner(AlkRepository repository) {
		return args -> {
			Alkuzemelteto alkuzemelteto = new Alkuzemelteto(
					"Béla",
					"HD-31313",
					"04-04-1990",
					"HOL-135"
			);


			repository.insert(alkuzemelteto);
		};
	}

}
