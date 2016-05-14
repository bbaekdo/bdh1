package com.j2.w10.facade;

public class DeskLamp {
  public void on() {
    System.out.println("Desklamp on");
  }
  public void setLight(int level) {
    System.out.println("Setting Desklamp's Light to "+level);
  }
  public void off() {
    System.out.println("Desklamp off");
  }
}