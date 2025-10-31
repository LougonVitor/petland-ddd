package com.petland.assistance.service;

import com.petland.assistance.exception.AssistanceAlreadyExistsException;
import com.petland.assistance.mapper.AssistanceMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petland.assistance.model.dto.AssistanceRequestDto;
import com.petland.assistance.model.entity.AssistanceEntity;
import com.petland.assistance.repository.IAssistanceRepository;

import java.util.Optional;

@Service
public class AssistanceService {

    @Autowired
    private IAssistanceRepository assistanceRepository;
        
    public Integer save(AssistanceRequestDto request) {

        if (!this.assistanceRepository.existsByDescriptionAndType(request.getDescription(), request.getType())) {
            AssistanceEntity entity = AssistanceMapper.toEntity(request);
            return this.assistanceRepository.save(entity).getId();
        } else {
            AssistanceEntity entity = this.assistanceRepository.findByDescriptionAndType(request.getDescription(), request.getType());
            throw new AssistanceAlreadyExistsException("Assistance " + request.getDescription() + " already exists. ID: " + entity.getId());
        }
    }
}