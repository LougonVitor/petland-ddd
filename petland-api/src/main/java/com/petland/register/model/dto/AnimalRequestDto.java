package com.petland.register.model.dto;

import java.time.LocalDate;

import com.petland.register.model.AnimalSpecies;

import lombok.Data;

@Data
public class AnimalRequestDto {
    private String name;
    private LocalDate birthday;
    private AnimalSpecies specie;
    private Integer tutor;
}