package com.petland.model.dto;

import java.time.LocalDate;

import com.petland.model.AnimalSpecies;

import lombok.Data;

@Data
public class AnimalResponseDto {
    private Integer id;
    private String name;
    private LocalDate birthday;
    private AnimalSpecies specie;
}