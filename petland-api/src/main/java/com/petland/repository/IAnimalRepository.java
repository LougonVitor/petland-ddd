package com.petland.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petland.model.entity.AnimalEntity;

public interface IAnimalRepository extends JpaRepository<AnimalEntity, Integer>{

}