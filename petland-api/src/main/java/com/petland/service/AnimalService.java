package com.petland.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petland.repository.IAnimalRepository;
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
}