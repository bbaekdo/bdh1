package com.j2.w11.Barista.Template;

public abstract class CaffeineBeverageWithHook {
  public final void prepareRecipe() {
    boilWater();
    brew();
    pourInCup();
    if (customerWantsCondiments()) {
      addCondiments();
    }
  }
  abstract void brew();
  abstract void addCondiments();
  void boilWater() {
    System.out.println("Boiling water..");
  }
  void pourInCup() {
    System.out.println("Pouring into Cup");
  }
  boolean customerWantsCondiments() {
    return true;
  }
}