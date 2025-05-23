package com.petland.register.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petland.register.model.entity.AnimalEntity;

public interface IAnimalRepository extends JpaRepository<AnimalEntity, Integer>{

}