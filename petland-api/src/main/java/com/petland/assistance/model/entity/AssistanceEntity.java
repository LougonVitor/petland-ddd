package com.petland.assistance.model.entity;

import java.time.LocalDate;

import com.petland.assistance.model.AssistanceStatus;
import com.petland.assistance.model.AssistanceType;

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
@Table(name ="assistance")
@Data
public class AssistanceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Integer id;

    private String description;
    private LocalDate date;
    private Double value;
    private boolean emergency;

    @Enumerated(EnumType.STRING)
    private AssistanceType type;

    @Enumerated(EnumType.STRING)
    private AssistanceStatus status;

    @Column(name = "cd_animal")
    private Integer animal;
    @Column(name = "cd_product_service")
    private Integer productService;
    @Column(name = "cd_register")
    private Integer register;
}