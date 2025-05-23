package com.petland.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petland.model.dto.AnimalResponseDto;
import com.petland.service.AnimalService;

@RestController
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @GetMapping("/animals")
    public List<AnimalResponseDto> toList() {
        return this.animalService.toList();
    }
}