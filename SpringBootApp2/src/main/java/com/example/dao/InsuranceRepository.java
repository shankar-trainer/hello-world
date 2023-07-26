package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Insurance;

@Repository
public interface InsuranceRepository extends JpaRepository<Insurance, Integer> {

}
