package com.j2.w13.after;

public class GumballMachine {
  // final static int SOLD_OUT=0;
  State soldOutState;
  // final static int NO_QUARTER=1;
  State noQuarterState;
  // final static int HAS_QUARTER=2;
  State hasQuarterState;
  // final static int SOLD=3;
  State soldState;
  
  State outofOrderState;
  
  // int state = SOLD_OUT;
  State state=soldOutState;
  int count=0;
  
  public GumballMachine(int count) {
    soldOutState = new SoldOutState(this);
    noQuarterState = new NoQuarterState(this);
    hasQuarterState = new HasQuarterState(this);
    soldState = new SoldState(this);
    outofOrderState = new OutOfOrderState(this);
    
    this.count=count;
    if (count>0) {
      //state=NO_QUARTER;
      state=noQuarterState;
    }
  }
  public void insertQuarter() {
    state.insertQuarter();
  }
  public void ejectQuarter() {
    state.ejectQuarter();
  }
  public void turnCrank() {
    state.turnCrank();
    state.dispense();
  }
  public void quarterError() {
    state.quarterError();
  }
  void setState(State state) {
    this.state=state;
  }
  
  void releaseBall() {
    System.out.println("A gumball comes rolling out the slot...");
    if (count != 0) {
      count = count - 1;
    }
  }
  
  int getCount() {
    return count;
  }
  
  void refill(int count) {
    this.count = count;
    state = noQuarterState;
  }
  
  
  public State getNoQuarterState() {
    return noQuarterState;
  }
  public State getState() {
    return state;
  }
  public State getSoldOutState() {
    return soldOutState;
  }
  public State getHasQuarterState() {
    return hasQuarterState;
  }
  public State getSoldState() {
    return soldState;
  }
  public State getOutOfOrderState() {
    return outofOrderState;
  }
  public String toString() {
    StringBuffer result = new StringBuffer();
    result.append("\nMighty Gumball, Inc.");
    result.append("\nJava-enabled Standing Gumball Model #2004");
    result.append("\nInventory: " + count + " gumball");
    if (count != 1) {
      result.append("s");
    }
    result.append("\n");
    result.append("Machine is " + state + "\n");
    return result.toString();
  }
}