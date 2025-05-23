package com.petland.register.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class Address {
    @Column(name = "public_place", length = 50)
    private String publicPlace;
    @Column(length = 6)
    private String number;
}