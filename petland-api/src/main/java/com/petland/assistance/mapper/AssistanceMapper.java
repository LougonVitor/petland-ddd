package com.petland.assistance.mapper;

import com.petland.assistance.model.dto.AssistanceRequestDto;
import com.petland.assistance.model.dto.AssistanceResponseDto;
import com.petland.assistance.model.entity.AssistanceEntity;

public class AssistanceMapper {

    public static AssistanceResponseDto toDto(AssistanceEntity entity) {
        AssistanceResponseDto assistance = new AssistanceResponseDto();

        assistance.setDescription(entity.getDescription());
        assistance.setDate(entity.getDate());
        assistance.setValue(entity.getValue());
        assistance.setEmergency(entity.isEmergency());
        assistance.setType(entity.getType());
        assistance.setStatus(entity.getStatus());
        assistance.setAnimal(entity.getAnimal());
        assistance.setProductService(entity.getProductService());
        assistance.setRegister(entity.getRegister());

        return assistance;
    }

    public static AssistanceEntity toEntity(AssistanceRequestDto dto) {
        AssistanceEntity assistance = new AssistanceEntity();

        assistance.setDescription(dto.getDescription());
        assistance.setDate(dto.getDate());
        assistance.setValue(dto.getValue());
        assistance.setEmergency(dto.isEmergency());
        assistance.setType(dto.getType());
        assistance.setStatus(dto.getStatus());
        assistance.setAnimal(dto.getAnimal());
        assistance.setProductService(dto.getProductService());
        assistance.setRegister(dto.getRegister());

        return assistance;
    }
}