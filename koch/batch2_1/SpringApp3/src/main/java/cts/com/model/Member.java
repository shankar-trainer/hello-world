package cts.com.model;

import java.time.LocalTime;

import javax.annotation.PostConstruct;

public class Member {
	
	private int memberId;
	private String memberName;
	private LocalTime memberEntryTime;
	
	@PostConstruct
	public void init() {
//		this.memberId=878787;
//		this.memberName="sushant";
		this.memberEntryTime=LocalTime.now();
	}

	public int getMemberId() {
		return memberId;
	}

	
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public LocalTime getMemberEntryTime() {
		return memberEntryTime;
	}

	public void setMemberEntryTime(LocalTime memberEntryTime) {
		this.memberEntryTime = memberEntryTime;
	}

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberName=" + memberName + ", memberEntryTime=" + memberEntryTime
				+ "]";
	}

	
}
