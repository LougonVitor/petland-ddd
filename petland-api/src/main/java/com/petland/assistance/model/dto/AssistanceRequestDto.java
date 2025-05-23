package com.petland.assistance.model.dto;

import java.time.LocalDate;

import com.petland.assistance.model.AssistanceStatus;
import com.petland.assistance.model.AssistanceType;

import lombok.Data;

@Data
public class AssistanceRequestDto {
    private String description;
    private LocalDate date;
    private Double value;
    private boolean emergency;
    private AssistanceType type;
    private AssistanceStatus status;
    private Integer animal;
    private Integer productService;
    private Integer register;
}