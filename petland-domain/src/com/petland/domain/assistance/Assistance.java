package com.petland.domain.assistance;

import com.petland.domain.register.Animal;
import com.petland.domain.register.ProductService;
import com.petland.domain.register.Register;

import java.time.LocalDate;
import java.time.LocalTime;

public class Assistance {
    private Integer id;
    private AssistanceType type;
    private AssistanceState state;
    private String description;
    private LocalDate date;
    private LocalTime hour;
    private boolean emergency;

    private Register requester;
    private ProductService service;
    private Animal patient;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public AssistanceType getType() {
        return type;
    }

    public void setType(AssistanceType type) {
        this.type = type;
    }

    public AssistanceState getState() {
        return state;
    }

    public void setState(AssistanceState state) {
        this.state = state;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getHour() {
        return hour;
    }

    public void setHour(LocalTime hour) {
        this.hour = hour;
    }

    public boolean isEmergency() {
        return emergency;
    }

    public void setEmergency(boolean emergency) {
        this.emergency = emergency;
    }

    public Register getRequester() {
        return requester;
    }

    public void setRequester(Register requester) {
        this.requester = requester;
    }

    public ProductService getService() {
        return service;
    }

    public void setService(ProductService service) {
        this.service = service;
    }

    public Animal getPatient() {
        return patient;
    }

    public void setPatient(Animal patient) {
        this.patient = patient;
    }
}