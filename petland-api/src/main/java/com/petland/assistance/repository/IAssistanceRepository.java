package com.petland.assistance.repository;

import com.petland.assistance.model.AssistanceType;
import org.springframework.data.jpa.repository.JpaRepository;

import com.petland.assistance.model.entity.AssistanceEntity;

import java.util.Optional;

public interface IAssistanceRepository extends JpaRepository<AssistanceEntity, Integer>{
    boolean existsByDescriptionAndType(String description, AssistanceType type);
    AssistanceEntity findByDescriptionAndType(String description, AssistanceType type);
}