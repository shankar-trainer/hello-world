package com.packt.bestpractices.smell;

import java.util.List;

import com.packt.bestpractices.smell.dto.CheckInRequest;
import com.packt.bestpractices.smell.dto.Encounter;
import com.packt.bestpractices.smell.dto.Patient;

public interface EncounterService {
  Encounter checkIn(CheckInRequest checkInRequest);
  void discharge(Encounter encounter);
  
  List<Encounter> retreiveBy(Patient patient);
}
