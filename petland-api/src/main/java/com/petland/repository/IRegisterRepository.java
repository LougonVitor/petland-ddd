package com.petland.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petland.model.entity.RegisterEntity;

public interface IRegisterRepository extends JpaRepository<RegisterEntity, Integer> {
}