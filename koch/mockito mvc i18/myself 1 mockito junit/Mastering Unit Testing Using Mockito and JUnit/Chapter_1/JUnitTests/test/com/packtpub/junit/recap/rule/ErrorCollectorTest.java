package com.packtpub.junit.recap.rule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import static org.hamcrest.CoreMatchers.equalTo;

public class ErrorCollectorTest {

	 @Rule
	 public ErrorCollector collector = new ErrorCollector();
	  
	 @Test
	 public void fails_after_execution() {
	 collector.checkThat(2.00, equalTo(5.01));
	 collector.checkThat(1, equalTo(2));
	 collector.checkThat("ae", equalTo("g"));
	 }
}
