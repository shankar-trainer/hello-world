package com.cts.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.model.CashPayment;

@Repository
public interface CashRepository  extends JpaRepository<CashPayment, Long> {

}
