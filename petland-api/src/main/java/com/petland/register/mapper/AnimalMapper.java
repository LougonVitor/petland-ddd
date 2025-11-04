package com.petland.register.mapper;

import com.petland.register.model.dto.AnimalRequestDto;
import com.petland.register.model.dto.AnimalResponseDto;
import com.petland.register.model.entity.AnimalEntity;

public class AnimalMapper {
    public static AnimalResponseDto toDto(AnimalEntity entity) {
        AnimalResponseDto dto = new AnimalResponseDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setBirthday(entity.getBirthday());
        dto.setSpecie(entity.getSpecie());
        dto.setTutor(entity.getTutor());

        return dto;
    }

    public static AnimalEntity toEntity(AnimalRequestDto dto) {
        AnimalEntity entity = new AnimalEntity();
        entity.setName(dto.getName());
        entity.setBirthday(dto.getBirthday());
        entity.setSpecie(dto.getSpecie());
        entity.setTutor(dto.getTutor());

        return entity;
    }

    public static AnimalEntity updateAnimal(AnimalRequestDto request, AnimalEntity entity) {
        entity.setName(request.getName());
        entity.setBirthday(request.getBirthday());
        entity.setSpecie(request.getSpecie());
        entity.setTutor(request.getTutor());

        return entity;
    }
}