package com.petland.register.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petland.register.model.entity.RegisterEntity;

public interface IRegisterRepository extends JpaRepository<RegisterEntity, Integer> {
}