package com.petland.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petland.repository.IAnimalRepository;

import ch.qos.logback.core.joran.util.beans.BeanUtil;

import com.petland.model.dto.AnimalRequestDto;
import com.petland.model.dto.AnimalResponseDto;
import com.petland.model.entity.AnimalEntity;

@Service
public class AnimalService {
    @Autowired
    private IAnimalRepository animalRepository;

    public List<AnimalResponseDto> toList() {
        List<AnimalEntity> entities = this.animalRepository.findAll();
        List<AnimalResponseDto> response = new ArrayList<>();

        for(AnimalEntity e: entities) {
            AnimalResponseDto res = new AnimalResponseDto();
            
            BeanUtils.copyProperties(e, res);

            response.add(res);
        }

        return response;
    }

    public Integer record(AnimalRequestDto request) {
        AnimalEntity entity = new AnimalEntity();
        BeanUtils.copyProperties(request, entity);
        return this.animalRepository.save(entity).getId();
    }

    public Integer update(Integer id, AnimalRequestDto request) {
        AnimalEntity entityDb = this.animalRepository.findById(id).orElse(null);

        if(entityDb != null) {
            BeanUtils.copyProperties(request, entityDb);
            return this.animalRepository.save(entityDb).getId();
        }

        return null;
    }

    public void delete(Integer id) {
        AnimalEntity entityDb = this.animalRepository.findById(id).orElse(null);

        if(entityDb != null) {
            this.animalRepository.delete(entityDb);
        }
    }
}