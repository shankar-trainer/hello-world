package cts.com.model;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Library {

	private int libraryId;
	private String libraryName;
	private  String libraryLocation;
	
	//@Resource(name="member2")
	 @Inject
	 @Qualifier("member2")

	 
	//@Autowired
	//@Qualifier("member2")
	private Member member;
	
	
	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	@PostConstruct
	public void init() {
		this.libraryId=87878787;
		this.libraryName="gandhi library";
		this.libraryLocation="new delhi";
	}

	public int getLibraryId() {
		return libraryId;
	}

	public void setLibraryId(int libraryId) {
		this.libraryId = libraryId;
	}

	public String getLibraryName() {
		return libraryName;
	}

	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}

	public String getLibraryLocation() {
		return libraryLocation;
	}

	public void setLibraryLocation(String libraryLocation) {
		this.libraryLocation = libraryLocation;
	}

	@Override
	public String toString() {
		return "Library [libraryId=" + libraryId + ", libraryName=" + libraryName + ", libraryLocation="
				+ libraryLocation + ", member=" + member + "]";
	}

	
	
	
	
}
