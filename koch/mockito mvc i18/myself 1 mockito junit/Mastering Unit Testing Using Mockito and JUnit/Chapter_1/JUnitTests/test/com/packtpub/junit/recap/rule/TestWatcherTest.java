package com.packtpub.junit.recap.rule;

import static org.junit.Assert.fail;

import org.junit.AfterClass;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.junit.runners.MethodSorters;
import org.junit.runners.model.Statement;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestWatcherTest {

	private static String dog = "";

	  @Rule
	  public TestWatcher watchman = new TestWatcher() {
	    @Override
	    public Statement apply(Statement base, Description description) {
	      return super.apply(base, description);
	    }

	    @Override
	    protected void succeeded(Description description) {
	      dog += description.getDisplayName() + " " + "success!\n";
	    }

	    @Override
	    protected void failed(Throwable e, Description description) {
	      dog += description.getDisplayName() + " " + e.getClass().getSimpleName() + "\n";
	    }

	    @Override
	    protected void starting(Description description) {
	      super.starting(description);
	    }

	    @Override
	    protected void finished(Description description) {
	      super.finished(description);
	    }
	  };

	  @Test
	  public void red_test() {
	    fail();
	  }

	  @Test
	  public void green() {
	  }
	
	  @AfterClass
	  public static void afterClass() {
		  System.out.println(dog);
	  }
}
