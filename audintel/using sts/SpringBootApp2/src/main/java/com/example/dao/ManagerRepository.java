package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Manager;

@Repository
public interface ManagerRepository extends JpaRepository<Manager, Integer> {

}
