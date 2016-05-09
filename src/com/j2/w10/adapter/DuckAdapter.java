package com.j2.w10.adapter;

public class DuckAdapter implements Turkey {
  Duck duck;
  public DuckAdapter(Duck duck) {
    this.duck=duck;
  }
  public void gobble() {
    duck.quack();
  }
  public void fly() {
    duck.fly();
  }
}