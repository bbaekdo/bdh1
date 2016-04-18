package com.j2.w7;

public interface PizzaIngredientFactory {
  public Dough createDough() {
    return new ThickCrustDough();
  }
  public Cheese createCheese() {
    return new MozzarellaCheese();
  }
}

