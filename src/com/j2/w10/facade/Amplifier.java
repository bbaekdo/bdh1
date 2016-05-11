package com.j2.w10.facade;

public class Amplifier {
  DvdPlayer dvd;
  public void on() {
    System.out.println("Amplifier on");
  }
  public void off() {
    System.out.println("Amplifier off");
  }
  public void setDvd(DvdPlayer dvd) {
    this.dvd=dvd;
    System.out.println("Setting Dvdplayer to "+dvd);
  }
  public void setVolume(int level) {
    System.out.println("Setting volume to "+level);
  }
}