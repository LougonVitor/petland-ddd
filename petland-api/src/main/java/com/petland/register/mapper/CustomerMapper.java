package com.petland.register.mapper;

import com.petland.register.model.dto.CustomerRequestDto;
import com.petland.register.model.dto.CustomerResponseDto;
import com.petland.register.model.entity.CustomerEntity;

public class CustomerMapper {
    static public CustomerEntity toEntity(CustomerRequestDto requestDto) {
        CustomerEntity entity = new CustomerEntity();

        entity.setName(requestDto.getName());
        entity.setAddress(requestDto.getAddress());
        entity.setProfile(requestDto.getProfile());

        return entity;
    }

    static public CustomerResponseDto toDto(CustomerEntity entity) {
        CustomerResponseDto dto = new CustomerResponseDto();

        dto.setName(entity.getName());
        dto.setAddress(entity.getAddress());
        dto.setProfile(entity.getProfile());

        return dto;
    }

    static public CustomerEntity updateEntity(CustomerRequestDto request, CustomerEntity entityDb) {
        entityDb.setName(request.getName());
        entityDb.setAddress(request.getAddress());
        entityDb.setProfile(request.getProfile());

        return entityDb;
    }
}