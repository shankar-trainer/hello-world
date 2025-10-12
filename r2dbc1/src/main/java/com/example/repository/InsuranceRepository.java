package com.example.repository;

import com.example.model.Insurance;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface InsuranceRepository  extends R2dbcRepository<Insurance, Long> {

}
