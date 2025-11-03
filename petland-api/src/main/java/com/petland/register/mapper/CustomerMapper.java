package com.petland.register.mapper;

import com.petland.register.model.dto.CustomerRequestDto;
import com.petland.register.model.dto.CustomerResponseDto;
import com.petland.register.model.entity.RegisterEntity;

public class CustomerMapper {
    static RegisterEntity toEntity(CustomerRequestDto requestDto) {
        RegisterEntity entity = new RegisterEntity();

        entity.setName(requestDto.getName());
        entity.setAddress(requestDto.getAddress());
        entity.setProfile(requestDto.getProfile());

        return entity;
    }

    static CustomerResponseDto toDto(RegisterEntity entity) {
        CustomerResponseDto dto = new CustomerResponseDto();

        dto.setName(entity.getName());
        dto.setAddress(entity.getAddress());
        dto.setProfile(entity.getProfile());

        return dto;
    }
}