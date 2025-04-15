package com.packtpub.junit.recap.rule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExpectedExceptionRuleTest {

	 @Rule
	  public ExpectedException thrown= ExpectedException.none();

	  @Test
	  public void throwsNothing() {

	  }

	  @Test
	  public void throwsNullPointerException() {
	    thrown.expect(NullPointerException.class);
	    throw new NullPointerException();
	  }

	  @Test
	  public void throwsIllegalStateExceptionWithMessage() {
	    thrown.expect(IllegalStateException.class);
	    thrown.expectMessage("Is this a legal state?");
	   
	    throw new IllegalStateException("Is this a legal state?");
	  }
}
