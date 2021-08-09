package com.natwest.zoo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.natwest.zoo.domain.Animals;
import com.natwest.zoo.service.AnimalService;

@RestController
@CrossOrigin
public class AnimalController {
	
	
	private AnimalService service;
	
	@Autowired
	public AnimalController(AnimalService service) {
		super();
		this.service = service;
	}

	@GetMapping(path = "/read")
	public ResponseEntity<List<Animals>> getAll() {
		return new ResponseEntity<List<Animals>>(this.service.readAll(), HttpStatus.OK);
	}

	@GetMapping("/findbyid/ {id}")
	public ResponseEntity<Animals> FindById(@PathVariable("id") Long id) {
		return new ResponseEntity<Animals>(this.service.findById(id), HttpStatus.FOUND);

	}
	
	@PostMapping("/create")
	public ResponseEntity<Animals> create(@RequestBody Animals animals) {
		return new ResponseEntity<Animals>(this.service.create(animals), HttpStatus.CREATED);
	}

	@DeleteMapping("/delete/ {id}")
	public ResponseEntity<Boolean> update(@PathVariable Long id) {
		return new ResponseEntity<Boolean>(this.service.delete(id), HttpStatus.NO_CONTENT);
	}
	
	@PutMapping("/update/ {id}")
	public ResponseEntity<Animals> update(@PathVariable ("id") Long id, @RequestBody Animals animals) {
		return new ResponseEntity<Animals>(this.service.update(id, animals), HttpStatus.ACCEPTED);
	}

}
