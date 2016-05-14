package com.j2.w10.facade;

public class Laptop {
  public void on() {
    System.out.println("Laptop turns on");
  }
  public void searchAbout(String keyword) {
    System.out.println("Let me search about "+keyword);
  }
  public void off() {
    System.out.println("Laptop turns off");
  }
}