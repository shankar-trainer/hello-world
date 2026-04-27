package com.cts.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.model.Insurance;

public interface InsuranceRepository  extends JpaRepository<Insurance, Integer>{

}
