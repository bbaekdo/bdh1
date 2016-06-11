package com.j2.w14.proxy;

public class OutOfOrderState implements State {
  transient GumballMachine gumballMachine;
  
  public OutOfOrderState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }
  
  public void insertQuarter() {
    System.out.println("Machine is out of order. You should not insert quater!");
  }
  public void ejectQuarter() {
    System.out.println("Machine is out of order. You can`t eject quarter!");
  }
  public void quarterError() {
    System.out.println("You Inserted wrong quarter. Try again with other quarter.");
  }
  public void turnCrank() {
    System.out.println("Machine is out of order. You can`t take gumball");
  }
 
  public void dispense() {
    System.out.println("Machine is out of order. No gumball dispensed");
  } 
 
  public String toString() {
    return "Gumball Machine is out of order";
  }
}