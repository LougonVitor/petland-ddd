package com.petland.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petland.repository.IAnimalRepository;
import com.petland.model.Animal;

@RestController
public class AnimalController {

    @Autowired
    private IAnimalRepository animalRepository;

    @GetMapping("/animais")
    public List<Animal> toList() {
        return this.animalRepository.findAll();
    }
}