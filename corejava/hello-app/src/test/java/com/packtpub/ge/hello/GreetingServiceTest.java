package com.packtpub.ge.hello;


import org.junit.*;
import static org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

public class GreetingServiceTest {

  GreetingService service;

  @Before
  public void setup() {
    service = new GreetingService();
  }

  @Test
  public void testGreet() {
    assertEquals("Hello Test", service.greet("Test"));
  }
}
