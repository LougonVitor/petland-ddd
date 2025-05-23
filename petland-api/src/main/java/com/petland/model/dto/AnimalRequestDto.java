package com.petland.model.dto;

import java.time.LocalDate;

import com.petland.model.AnimalSpecies;

import lombok.Data;

@Data
public class AnimalRequestDto {
    private String name;
    private LocalDate birthday;
    private AnimalSpecies specie;
}