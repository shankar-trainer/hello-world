package com.capegemini;

import com.capegemini.exception.VoterException;

public class Voter {

	private int voter_id;
	private String voter_name;
	private float voter_age;

	public int getVoter_id() {
		return voter_id;
	}

	public void setVoter_id(int voter_id) throws VoterException {
		if (voter_id < 1000 || voter_id > 10000)
			throw new VoterException("Voter id not in range 1000 - 10000");
		else
			this.voter_id = voter_id;
	}

	public String getVoter_name() {
		return voter_name;
	}

	public void setVoter_name(String voter_name) throws VoterException {
		try {
			if (voter_name.isEmpty())

				throw new VoterException("Voter name cannot be empty");
			else if (voter_name.length() < 5)
				throw new VoterException(
						"Voter name  length cannot be less than 5 character ");
			else
				this.voter_name = voter_name;
		} catch (VoterException e) {
			System.err.println(" at  server  name error is "+e.getMessage());
			throw e;
		}

	}

	public float getVoter_age() {
		return voter_age;
	}

	public void setVoter_age(float voter_age) throws VoterException {
		if (voter_age < 18)
			throw new VoterException("Not eligible for voting");
		else
			this.voter_age = voter_age;
	}

}
