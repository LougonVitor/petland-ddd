package com.petland.assistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petland.assistance.model.entity.AssistanceEntity;

public interface IAssistanceRepository extends JpaRepository<AssistanceEntity, Integer>{

}