package com.cts.model;

public class Speech {
	private int speechId;
	private String speechName;
	private int duration;

	public void setSpeechId(int speechId) {
		this.speechId = speechId;
	}


	public void setSpeechName(String speechName) {
		this.speechName = speechName;
	}


	public void setDuration(int duration) {
		this.duration = duration;
	}


	@Override
	public String toString() {
		return "Speech [speechId=" + speechId + ", speechName=" + speechName + ", duration=" + duration + "]";
	}

	
}
