package com.petland.model.dto;

import com.petland.model.Address;
import com.petland.model.Profile;

import lombok.Data;

@Data
public class CustomerRequestDto {
    private String name;
    private Profile profile;
    private Address address;
}