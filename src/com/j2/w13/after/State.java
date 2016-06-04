package com.j2.w13.after;

public interface State {
  public void insertQuarter();
  public void ejectQuarter();
  public void quarterError();
  public void turnCrank();
  public void dispense();
}