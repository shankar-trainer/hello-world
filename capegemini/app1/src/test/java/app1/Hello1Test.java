package app1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Hello1Test {

	Hello1 hello1;
	
	@BeforeEach
	public void init() {
		
		System.out.println(" init called");
	hello1=new Hello1();
	}
	
	@Test
	public void test1() {
		Assertions.assertEquals("hello", hello1.disp());
	}
	
}
