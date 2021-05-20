package com.cts.model;

public class Leader {
	
	private int leaderId;
	private String leaderName;
	private String leaderLocation;
	private Speech speech;
	
	public void leaderInit() {
		leaderId=76767;
		leaderName="ram kumar";
		leaderLocation="kanya kumari";
		speech.setSpeechId(77887);
		speech.setSpeechName("corruption");
		speech.setDuration(200);
		
		System.out.println("leader init called");
	}
	
	public void leaderDestroy() {
		System.out.println("leader destroy  called");
	}
	
	
	
	public void setLeaderId(int leaderId) {
		this.leaderId = leaderId;
	}
	public void setLeaderName(String leaderName) {
		this.leaderName = leaderName;
	}
	public void setLeaderLocation(String leaderLocation) {
		this.leaderLocation = leaderLocation;
	}
	public void setSpeech(Speech speech) {
		this.speech = speech;
	}
	
	@Override
	public String toString() {
		return "Leader [leaderId=" + leaderId + ", leaderName=" + leaderName + ", leaderLocation=" + leaderLocation
				+ ", speech=" + speech + "]";
	}
	
	

	
	
}
