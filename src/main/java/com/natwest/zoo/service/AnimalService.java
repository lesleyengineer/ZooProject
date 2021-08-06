package com.natwest.zoo.service;

import java.util.List;

import com.natwest.zoo.domain.Animals;
import com.natwest.zoo.repo.AnimalRepo;

public class AnimalService {
	
	public AnimalRepo repo;
	
	public AnimalService(AnimalRepo repo) {
		super();
		this.repo = repo; 
	}
		
		public List<Animals> readAll() {
			
			return this.repo.findAll();
	}
		
		public Animals findById(Long id) {
			return this.repo.findById(id).orElseThrow();

}
}