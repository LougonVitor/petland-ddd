package com.petland.register.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petland.register.model.dto.AnimalRequestDto;
import com.petland.register.model.dto.AnimalResponseDto;
import com.petland.register.service.AnimalService;

@RestController
@RequestMapping("/animals")
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @GetMapping()
    public List<AnimalResponseDto> toList() {
        return this.animalService.toList();
    }

    @PostMapping()
    public Integer save(@RequestBody AnimalRequestDto request) {
        return this.animalService.save(request);
    }

    @PutMapping("/{id}")
    public Integer update(@PathVariable ("id") Integer id, @RequestBody AnimalRequestDto request) {
        return this.animalService.update(id, request);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable ("id") Integer id) {
        this.animalService.delete(id);
    }
}