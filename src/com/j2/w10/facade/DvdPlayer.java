package com.j2.w10.facade;

public class DvdPlayer {
  String movie;
  public void on() {
    System.out.println("DvdPlayer on");
  }
  public void play(String movie) {
    this.movie=movie;
    System.out.println("DvdPlayer playing "+movie);
  }
  public void stop() {
    System.out.println("DvdPlayer stopped"+movie);
  }
  public void eject() {
    movie=null;
    System.out.println("Eject");
  }
  public void off() {
    System.out.println("DvdPlayer off");
  }
}