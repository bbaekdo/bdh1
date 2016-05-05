package com.j2.w9.undo;

public class DvDPlayer {
  public DvDPlayer() {}
  int stopPoint;
  
  public void dvdplay(){ 
    System.out.println("DvDPlayer plays.."); 
  } 
  public void dvdstop(){
    stopPoint=49;
    System.out.println("DvDPlayer stops"); 
  }
  public void stopPoint() {
    this.stopPoint=stopPoint;
    if(stopPoint==49) {
      System.out.println("Video stops at "+stopPoint+" min.");
    }
    else {
     dvdplay();
    }
  }
  public int getPoint() {
    return stopPoint;
  }
}