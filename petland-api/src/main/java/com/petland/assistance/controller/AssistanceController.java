package com.petland.assistance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petland.assistance.model.dto.AssistanceRequestDto;
import com.petland.assistance.service.AssistanceService;

@RestController
@RequestMapping("/assistance")
public class AssistanceController {

    @Autowired
    private AssistanceService assistanceService;
    
    @PostMapping()
    public Integer save(@RequestBody AssistanceRequestDto request) {
        return this.assistanceService.save(request);
    }
}