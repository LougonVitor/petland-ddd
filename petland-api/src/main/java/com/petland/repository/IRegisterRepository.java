package com.petland.repository;

import com.petland.model.Register;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRegisterRepository extends JpaRepository<Register, Integer> {
}