package headfirst.decorator.starbuzz;

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

public class StarbuzzCoffee {
  public static void main(String args[]) {
    Beverage b = new DarkRoast();
    Beverage md= new Mocha(b);
    Beverage wmd = new Whip(md);
    System.out.println(wmd.getDescription());
    System.out.println(wmd.cost());
  }
}
