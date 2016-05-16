package com.j2.w11.Barista.Simple;

public class Tea {
  void prepareRecipe() {
    boilWater();
    steepTeabag();
    pourInCup();
    addLemon();
  }
  public void boilWater() {
    System.out.println("Boiling Water");
  }
  public void steepTeabag() {
    System.out.println("Steeping Tea");
  }
  public void pourInCup() {
    System.out.println("Pouring in Cup");
  }
  public void addLemon() {
    System.out.println("Add Lemon");
  }
}