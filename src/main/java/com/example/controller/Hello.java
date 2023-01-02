package com.example.controller;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.annotation.Animal;
import com.example.annotation.Cachorro;

@RestController
@RequestMapping("/")
public class Hello {
		
	@Cachorro
	private Animal animal;
	
	@Bean
	public CommandLineRunner animalRunner() {
		return args -> {
			this.animal.fazerBarulho() ;
		};
	}
	
	@GetMapping("/hello")
	public String hello() {
	 return "Hello word from custom anotation";
	}
}
