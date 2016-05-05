package com.j2.w9.undo;

public class Light {
  public Light(){}
  int level;
  public void on(){ 
    level=100;
    System.out.println("Light on!"); 
  } 
  public void off(){ 
    level=0;
    System.out.println("Light off!"); 
  } 
  
  public void dim(int level) {
    this.level=level;
    if(level==0) {
      off();
    }
    else {
      System.out.println("Light is dimmed to "+level);
    }
  }
  public int getLevel() {
    return level;
  }
}