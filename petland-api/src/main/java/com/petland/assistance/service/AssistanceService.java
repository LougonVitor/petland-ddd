package com.petland.assistance.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petland.assistance.model.dto.AssistanceRequestDto;
import com.petland.assistance.model.entity.AssistanceEntity;
import com.petland.assistance.repository.IAssistanceRepository;

@Service
public class AssistanceService {

    @Autowired
    private IAssistanceRepository assistanceRepository;
        
    public Integer save(AssistanceRequestDto request) {
        AssistanceEntity entity = new AssistanceEntity();
        BeanUtils.copyProperties(request, entity);
        return this.assistanceRepository.save(entity).getId();
    }
}