package com.petland.register.model;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class Profile {
    private boolean customer;
    private boolean supplier;
    private boolean provider;
}