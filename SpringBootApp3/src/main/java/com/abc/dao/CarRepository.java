package com.abc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abc.model.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {

}
