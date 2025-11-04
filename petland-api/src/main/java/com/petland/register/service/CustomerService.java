package com.petland.register.service;

import java.util.ArrayList;
import java.util.List;

import com.petland.register.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petland.register.model.dto.CustomerRequestDto;
import com.petland.register.model.dto.CustomerResponseDto;
import com.petland.register.model.entity.CustomerEntity;
import com.petland.register.repository.IRegisterRepository;

@Service
public class CustomerService {
    @Autowired
    private IRegisterRepository registerRepository;

    public List<CustomerResponseDto> toList() {
        List<CustomerEntity> entities = this.registerRepository.findAll();
        List<CustomerResponseDto> response = new ArrayList<>();

        for(CustomerEntity e: entities) {
            CustomerResponseDto res = CustomerMapper.toDto(e);

            response.add(res);
        }

        return response;
    }

    public Integer save(CustomerRequestDto request) {
        CustomerEntity entity = CustomerMapper.toEntity(request);
        return this.registerRepository.save(entity).getId();
    }

    public Integer update(Integer id, CustomerRequestDto request) {
        CustomerEntity entityDb = this.registerRepository.findById(id).orElse(null);

        if(entityDb != null) {
            return this.registerRepository.save(CustomerMapper.updateEntity(request, entityDb)).getId();
        }

        return null;
    }

    public void delete(Integer id) {
        CustomerEntity entityDb = this.registerRepository.findById(id).orElse(null);

        if(entityDb != null) {
            this.registerRepository.delete(entityDb);
        }
    }
}