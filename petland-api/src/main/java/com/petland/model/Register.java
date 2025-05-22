package com.petland.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "register")
@Data
public class Register {
    @Id
    private Integer id;
    private String name;
    //private Profile profile;
    //private Address address;
}