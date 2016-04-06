package com.j2.w5;

abstract class Beverage {
  String description= "Unknown beverage";
  public String getDescription() {
    return description;
  }
  public abstract double cost();
}

class Espresso extends Beverage {
  public Espresso() {
    description="Espresso";
  }
  public double cost() {
    return 1.99;
  }
}

class DarkRoast extends Beverage {
  public DarkRoast() {
    description="Dark Roast Coffee";
  }
  public double cost() {
    return .99;
  }
}

abstract class CondimentDecorator extends Beverage {
  public abstract String getDescription();
}

class Mocha extends CondimentDecorator {
  Beverage beverage;
  public Mocha(Beverage b) {
    beverage=b;
  }
  public String getDescription() {
    return beverage.getDescription()+", Mocha";
  }
  
  public double cost() {
    return beverage.cost()+.20;
  }
}

class Whip extends CondimentDecorator {
  Beverage beverage;
  public Whip(Beverage b) {
    beverage=b;
  }
  public String getDescription() {
    return beverage.getDescription()+", Whip";
  }
  public double cost() {
    return beverage.cost()+.10;
  }
}

class Milk extends CondimentDecorator {
  Beverage beverage;
  public Milk(Beverage b) {
    beverage=b;
  }
  public String getDescription() {
    return beverage.getDescription()+", Milk";
  }
  
  public double cost() {
    return beverage.cost()+.20;
  }
}

class CaramelSyrup extends CondimentDecorator {
  Beverage beverage;
  public CaramelSyrup(Beverage b) {
    beverage=b;
  }
  public String getDescription() {
    return beverage.getDescription()+", Caramel Syrup";
  }
  
  public double cost() {
    return beverage.cost()+.10;
  }
}

class CaramelSauce extends CondimentDecorator {
  Beverage beverage;
  public CaramelSauce(Beverage b) {
    beverage=b;
  }
  public String getDescription() {
    return beverage.getDescription()+", Caramel Sauce";
  }
  
  public double cost() {
    return beverage.cost()+.05;
  }
}

public class StarbuzzCoffee2 {
  public static void main(String args[]) {
    Beverage b = new DarkRoast();
    Beverage md= new Mocha(b);
    Beverage wmd = new Whip(md);
    System.out.println(wmd.getDescription());
    System.out.println(wmd.cost());
    
    Beverage c = new Espresso();
    Beverage me = new Milk(c);
    Beverage cme = new CaramelSyrup(me);
    Beverage ccme = new CaramelSauce(cme);
    System.out.println("* Caramel Macciato recipe is "+ccme.getDescription());
    System.out.println("* Cost is "+ccme.cost());
  }
}
