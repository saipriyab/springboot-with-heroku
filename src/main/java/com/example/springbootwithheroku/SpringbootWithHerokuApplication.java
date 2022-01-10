package com.example.springbootwithheroku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootWithHerokuApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWithHerokuApplication.class, args);
	}

	@GetMapping("/")
	public String sayHi() {
		return "wlcome to heroku";
	}

	@GetMapping("/message/{input}")
	public String getMessage(@PathVariable String input) {
		return "welcome " + input;
	}
}
