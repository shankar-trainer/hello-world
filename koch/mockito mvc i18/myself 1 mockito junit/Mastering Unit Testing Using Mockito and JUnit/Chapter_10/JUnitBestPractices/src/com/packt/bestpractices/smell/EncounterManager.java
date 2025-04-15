package com.packt.bestpractices.smell;

import java.util.List;
import java.util.Map;

import com.packt.bestpractices.smell.dto.CheckInRequest;
import com.packt.bestpractices.smell.dto.Encounter;
import com.packt.bestpractices.smell.dto.Patient;

public final class EncounterManager {
	private List<Encounter> retrieveEncounters() {
		if (encounters == null) {
			Patient patient = new Patient();
			patient.setPatientId(patientId);
			new EncounterServiceImpl().retreiveBy(patient);
		}

		return encounters;
	}

	public List<Encounter> encounters;

	public void setEncounters(List<Encounter> encounters) {
		this.encounters = encounters;
	}

	private String patientId;
	public boolean isHack = false;

	public boolean save(Map data) {
		if (isHack) {
			return true;
		}
		Encounter enc = new EncounterServiceImpl()
				.checkIn(buildCheckinRqst(data));
		return enc != null;
	}

	protected CheckInRequest buildCheckinRqst(Map data) {
		return new CheckInRequest();
	}

	public static final int HACKED_NUMBER = 101;

	@Override
	public int hashCode() {
		return isHack ? HACKED_NUMBER : 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof EncounterManager) {
			return isHack && ((EncounterManager) obj).isHack;
		}
		return false;
	}
}
