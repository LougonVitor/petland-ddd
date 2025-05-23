package com.petland.register.model.entity;

import java.time.LocalDate;

import com.petland.register.model.AnimalSpecies;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Entity
@Table(name = "animal")
@Data
public class AnimalEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Integer id;
    @Column(length = 50, nullable = false)
    private String name;
    private LocalDate birthday;

    @Enumerated(EnumType.STRING)
    private AnimalSpecies specie;

    @Column(name = "cd_tutor")
    private Integer tutor;
}