package com.petland.register.model.dto;

import lombok.Data;

@Data
public class AnimalResponseDto extends AnimalRequestDto {
    private Integer id;
}