package com.j2.w13.after;

public class GumballMachineTestDrive {
  public static void main(String[] args) {
    GumballMachine gumballMachine = new GumballMachine(5);
    
    System.out.println(gumballMachine);
    gumballMachine.insertQuarter();
    gumballMachine.turnCrank();
    
    System.out.println(gumballMachine);
    gumballMachine.insertQuarter();
    gumballMachine.turnCrank();  
    System.out.println(gumballMachine);
  }
}
