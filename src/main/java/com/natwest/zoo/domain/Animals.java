package com.natwest.zoo.domain;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Animals {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	private String name;
	private String habitat;
	private String food;
	private int age;
	
	public Animals() {
		super(); 
	}
	
	public Animals (String habitat, String food, int age) {
		super();
		this.habitat = habitat;
		this.food = food;
		this.age = age;
		
	}

	public Animals (Long id, String habitat, String food, int age) {
		super();
		this.id = id;
		this.habitat = habitat;
		this.food = food;
		this.age = age;
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(habitat, food, age);
	}

	@Override
	public String toString() {
		return "Animals [habitat=" + habitat + ", food=" + food + ", age=" + age + "]";

}
	
}
