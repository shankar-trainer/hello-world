package app1;

import org.springframework.stereotype.Component;

@Component
public class Mobile {

	private long homeno;
	private long  officeno;
	
	public void init() {
		homeno=767767767;
		officeno=76897788;
		
	}
	
	
	public long getHomeno() {
		return homeno;
	}
	public void setHomeno(long homeno) {
		this.homeno = homeno;
	}
	public long getOfficeno() {
		return officeno;
	}
	public void setOfficeno(long officeno) {
		this.officeno = officeno;
	}
	@Override
	public String toString() {
		return "Mobile [homeno=" + homeno + ", officeno=" + officeno + "]";
	}
	
	
	
}
