package com.natwest.zoo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.natwest.zoo.domain.Animals;
import com.natwest.zoo.repo.AnimalRepo;
@Service
public class AnimalService {
	
	public AnimalRepo repo;
	@Autowired
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
		
		//CREATE
		public Animals create(Animals animals) {
			return this.repo.saveAndFlush(animals);
		}
		
		//DELETE
		public Boolean delete(Long id) {
			this.repo.deleteById(id);
			return this.repo.existsById(id);
		}
		//UPDATE
		public Animals update(Long id, Animals animals) {
			Animals exists = this.repo.getById(id);
			exists.setName(animals.getName());
			exists.setAge(animals.getAge());
			exists.setHabitat(animals.getHabitat());
			exists.setFood(animals.getFood());
			Animals updated = this.repo.save(exists);
			return updated;
		}

}