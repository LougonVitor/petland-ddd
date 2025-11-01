package com.petland.register.repository;

import com.petland.register.model.AnimalSpecies;
import org.springframework.data.jpa.repository.JpaRepository;

import com.petland.register.model.entity.AnimalEntity;

public interface IAnimalRepository extends JpaRepository<AnimalEntity, Integer>{
    AnimalEntity findByNameAndSpecie(String name, AnimalSpecies specie);
}