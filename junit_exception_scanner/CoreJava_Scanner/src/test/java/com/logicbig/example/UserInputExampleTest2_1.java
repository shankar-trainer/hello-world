package com.logicbig.example;

import org.junit.Assert;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class UserInputExampleTest2_1 {

  @Test
  public void userInputTest() {
      ByteArrayInputStream inputStream = new ByteArrayInputStream("3\n4\n".getBytes());
      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      PrintStream ps = new PrintStream(byteArrayOutputStream);
      UserInputExample1 userInputExample = new UserInputExample1();
      userInputExample.start();
      String outputText = byteArrayOutputStream.toString();
      String key = "output:";
      String output = outputText.substring(outputText.indexOf(key) + key.length()).trim();
      Assert.assertEquals(output, "7");
  }
}
