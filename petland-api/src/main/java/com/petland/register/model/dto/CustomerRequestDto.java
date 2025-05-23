package com.petland.register.model.dto;

import com.petland.register.model.Address;
import com.petland.register.model.Profile;

import lombok.Data;

@Data
public class CustomerRequestDto {
    private String name;
    private Profile profile;
    private Address address;
}