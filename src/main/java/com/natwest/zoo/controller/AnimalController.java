package com.natwest.zoo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimalController {
	
	@RequestMapping("/animal")
	public String getHabitat() {
		return "You will find me in the tropical section ok";
	}

}
