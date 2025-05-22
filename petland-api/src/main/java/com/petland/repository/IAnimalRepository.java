package com.petland.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petland.model.Animal;

public interface IAnimalRepository extends JpaRepository<Animal, Integer>{

}