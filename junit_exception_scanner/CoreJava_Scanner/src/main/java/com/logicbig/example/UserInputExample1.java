package com.logicbig.example;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class UserInputExample1 {
  private Scanner scanner;
  private PrintStream printStream;

  public UserInputExample1() {
      this.scanner = new Scanner(System.in);
  }

  public void start() {
      System.out.println("Enter number 1");
      int x = scanner.nextInt();
      System.out.println("Enter number 2");
      int y = scanner.nextInt();
      System.out.println("output: " + (x + y));
  }

  public static void main(String[] args) {
      UserInputExample1 userInputExample = new UserInputExample1();
      userInputExample.start();
  }
}
