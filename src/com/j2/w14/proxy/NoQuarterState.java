package com.j2.w14.proxy;

public class NoQuarterState implements State {
  transient GumballMachine gumballMachine;
  
  public NoQuarterState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }
  
  public void insertQuarter() {
    System.out.println("You inserted a quarter");
    gumballMachine.setState(gumballMachine.getHasQuarterState());
  }
  public void quarterError() {
    System.out.println("You Inserted wrong quarter. Try again with other quarter.");
  }
  public void ejectQuarter() {
    System.out.println("You haven't inserted a quarter");
  }
 
  public void turnCrank() {
    System.out.println("You turned, but No quarter now");
  }
 
  public void dispense() {
    System.out.println("Pay First please.");
  } 
 
  public String toString() {
    return "waiting for quarter";
  }
}
