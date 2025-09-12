package com.petland.register.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.petland.register.exception.AnimalSpeciesNotFoundException;

import java.util.*;

public enum AnimalSpecies {
    CAT(1),
    DOG(2),
    SNAKE(3);

    private final int value;
    private static final LinkedHashMap<Integer, String> animalSpeciesDictionary = new LinkedHashMap<>();
    AnimalSpecies (int value) {
        this.value = value;
    }

    /*@JsonValue
    public String getSpecieName () {
        return this.name();
    }*/

    @JsonCreator
    public static AnimalSpecies fromValue(int value) {
        for (AnimalSpecies species : AnimalSpecies.values()) {
            AnimalSpecies.animalSpeciesDictionary.put(species.value, species.toString());

            if (species.value == value) {
                return species;
            }
        }
        throw new AnimalSpeciesNotFoundException("Unknown AnimalSpecies value: " + value + ", The only available numbers is: " +
                animalSpeciesDictionary);
    }
}