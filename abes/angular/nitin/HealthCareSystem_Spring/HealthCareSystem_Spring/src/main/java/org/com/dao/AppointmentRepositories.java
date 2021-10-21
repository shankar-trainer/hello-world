package org.com.dao;

import org.com.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepositories extends JpaRepository<Appointment, Integer>{

}
