package com.flight.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight.entities.Schedule;

public interface ScheduleRepository extends JpaRepository<Schedule, Integer> {

}
