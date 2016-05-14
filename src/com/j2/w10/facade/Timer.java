package com.j2.w10.facade;

public class Timer {
  int studyingTime;
  public void on() {
    System.out.println("Timer on");
  }
  public void setTime() {
    System.out.println("Setting time and start");
  }
  public void stop() {
    System.out.println("Stop the timer");
  }
  public void checkTime() {
    studyingTime=2;
    System.out.println("Wow I studied during "+studyingTime+" hours!!");
  }
  public void off() {
    System.out.println("Timer off");
  }
}