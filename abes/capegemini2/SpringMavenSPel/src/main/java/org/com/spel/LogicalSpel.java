package org.com.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class LogicalSpel {

	private boolean and;
	private boolean or;
	private boolean not;
	
	public boolean isAnd() {
		return and;
	}
	public void setAnd(boolean and) {
		this.and = and;
	}
	public boolean isOr() {
		return or;
	}
	public void setOr(boolean or) {
		this.or = or;
	}
	public boolean isNot() {
		return not;
	}
	public void setNot(boolean not) {
		this.not = not;
	}
	
	
	
	
	
	
}
