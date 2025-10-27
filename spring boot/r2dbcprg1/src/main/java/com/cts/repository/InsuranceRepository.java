package com.cts.repository;

import com.cts.model.Insurance;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface InsuranceRepository extends R2dbcRepository<Insurance,Integer> {

}
