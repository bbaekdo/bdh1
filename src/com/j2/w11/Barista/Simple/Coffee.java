package com.j2.w11.Barista.Simple;

public class Coffee {
  void prepareRecipe() {
    boilWater();
    brewCoffeeGrinds();
    pourInCup();
    addSugarAndMilk();
  }
  public void boilWater() {
    System.out.println("Boiling Water");
  }
  public void brewCoffeeGrinds() {
    System.out.println("Dripping Coffee through filter");
  }
  public void pourInCup() {
    System.out.println("Pouring In Cup");
  }
  public void addSugarAndMilk() {
    System.out.println("Adding Sugar and Milk");
  }
}

