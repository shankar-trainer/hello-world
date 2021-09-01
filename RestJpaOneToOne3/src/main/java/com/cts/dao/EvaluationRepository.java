package com.cts.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cts.model.Evaluation;

public interface EvaluationRepository extends JpaRepository<Evaluation, Integer> {

}
