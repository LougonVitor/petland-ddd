package com.petland.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petland.model.dto.CustomerRequestDto;
import com.petland.model.dto.CustomerResponseDto;
import com.petland.model.entity.RegisterEntity;
import com.petland.repository.IRegisterRepository;

@Service
public class CustomerService {
    @Autowired
    private IRegisterRepository registerRepository;

    public List<CustomerResponseDto> toList() {
        List<RegisterEntity> entities = this.registerRepository.findAll();
        List<CustomerResponseDto> response = new ArrayList<>();

        for(RegisterEntity e: entities) {
            CustomerResponseDto res = new CustomerResponseDto();
            
            BeanUtils.copyProperties(e, res);

            response.add(res);
        }

        return response;
    }

    public Integer record(CustomerRequestDto request) {
        RegisterEntity entity = new RegisterEntity();
        BeanUtils.copyProperties(request, entity);
        return this.registerRepository.save(entity).getId();
    }

    public Integer update(Integer id, CustomerRequestDto request) {
        RegisterEntity entityDb = this.registerRepository.findById(id).orElse(null);

        if(entityDb != null) {
            BeanUtils.copyProperties(request, entityDb);
            return this.registerRepository.save(entityDb).getId();
        }

        return null;
    }

    public void delete(Integer id) {
        RegisterEntity entityDb = this.registerRepository.findById(id).orElse(null);

        if(entityDb != null) {
            this.registerRepository.delete(entityDb);
        }
    }
}