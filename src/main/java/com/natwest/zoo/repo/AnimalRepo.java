package com.natwest.zoo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.natwest.zoo.domain.Animals;


@Repository
public interface AnimalRepo extends JpaRepository<Animals, Long> {

}
