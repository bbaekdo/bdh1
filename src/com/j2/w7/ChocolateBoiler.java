package com.j2.w7;

public class ChocolateBoiler {
  private boolean empty;
  private boolean boiled;
  private static int numCalled=0;
  private static ChocolateBoiler uniqueInstance;
  
  private ChocolateBoiler() {
    empty=true;
    boiled=false;
  }
  public static ChocolateBoiler getInstance() {
    if(uniqueInstance==null) {
      uniqueInstance=new ChocolateBoiler();
    }
    System.out.println("Returning instance of Chocolate Boiler");
    System.out.println("bdh: numCalled "+numCalled++);
    return uniqueInstance;
  }
  public void fill() {
    if(empty) {
      empty=false;
      boiled=false;
    }
  }
}