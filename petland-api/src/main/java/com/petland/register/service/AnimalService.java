package com.petland.register.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.petland.register.exception.AnimalNotFoundException;
import com.petland.register.mapper.AnimalMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petland.register.repository.IAnimalRepository;

import com.petland.register.model.dto.AnimalRequestDto;
import com.petland.register.model.dto.AnimalResponseDto;
import com.petland.register.model.entity.AnimalEntity;

@Service
public class AnimalService {
    @Autowired
    private IAnimalRepository animalRepository;

    public List<AnimalResponseDto> toList() {
        return this.animalRepository.findAll().stream()
                .map(AnimalMapper::toDto)
                .collect(Collectors.toList());
    }

    public Integer save(AnimalRequestDto request) {
        AnimalEntity entity = AnimalMapper.toEntity(request);
        return this.animalRepository.save(entity).getId();
    }

    public Integer update(Integer id, AnimalRequestDto request) {
        AnimalEntity entityDb = this.animalRepository.findById(id).orElseThrow(() -> new AnimalNotFoundException("Animal with ID " + id + " not found to update."));

        BeanUtils.copyProperties(request, entityDb);
        return this.animalRepository.save(entityDb).getId();
    }

    public void delete(Integer id) {
        AnimalEntity entityDb = this.animalRepository.findById(id).orElseThrow(() -> new AnimalNotFoundException("Animal with ID " + id + " not found to delete"));

        this.animalRepository.delete(entityDb);
    }
}