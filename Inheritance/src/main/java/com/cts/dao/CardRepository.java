package com.cts.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.model.CardPayment;

@Repository
public interface CardRepository  extends JpaRepository<CardPayment, Long> {

}
