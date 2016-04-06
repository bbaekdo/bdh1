package com.j2.w5;

abstract class Clothes {
  String description= "Unknown clothes";
  public String getDescription() {
    return description;
  }
  public abstract double score();
}

class shirts extends Clothes {
  public shirts() {
    description="Shirts";
  }
  public double score() {
    return 1.00;
  }
}

abstract class CondimentDecorator extends Clothes {
  public abstract String getDescription();
}

class DenimJeans extends CondimentDecorator {
  Clothes clothes;
  public DenimJeans(Clothes c) {
    clothes=c;
  }
  public String getDescription() {
    return clothes.getDescription()+", Denim Jeans";
  }
  
  public double score() {
    return clothes.score()+2.00;
  }
}

class DenimJackets extends CondimentDecorator {
  Clothes clothes;
  public DenimJackets(Clothes c) {
    clothes=c;
  }
  public String getDescription() {
    return clothes.getDescription()+", Denim Jackets";
  }
  
  public double score() {
    return clothes.score()+1.00;
  }
}

class BlackJeans extends CondimentDecorator {
  Clothes clothes;
  public BlackJeans(Clothes c) {
    clothes=c;
  }
  public String getDescription() {
    return clothes.getDescription()+", Black Jeans";
  }
  
  public double score() {
    return clothes.score()+4.00;
  }
}

class SkeletonBelt extends CondimentDecorator {
  Clothes clothes;
  public SkeletonBelt(Clothes c) {
    clothes=c;
  }
  public String getDescription() {
    return clothes.getDescription()+", SkeletonBelt";
  }
  
  public double score() {
    return clothes.score()-2.00;
  }
}

class Snapback extends CondimentDecorator {
  Clothes clothes;
  public Snapback(Clothes c) {
    clothes=c;
  }
  public String getDescription() {
    return clothes.getDescription()+", Snapback";
  }
  
  public double score() {
    return clothes.score()+4.00;
  }
}


public class FashionScore {
  public static void main(String args[]) {
    Clothes c = new shirts();
    Clothes dc = new DenimJeans(c);
    Clothes ddc = new DenimJackets(dc);
    System.out.println("Fashion : "+ddc.getDescription());
    System.out.println("Score : "+ddc.score());
    
    Clothes w = new shirts();
    Clothes dw = new DenimJeans(w);
    Clothes ddw = new DenimJackets(dw);
    Clothes sddw = new SkeletonBelt(ddw);
    System.out.println("Fashion : "+sddw.getDescription());
    System.out.println("Score : "+sddw.score());
    
    Clothes q = new shirts();
    Clothes bc = new BlackJeans(q);
    Clothes dbc = new DenimJackets(bc);
    Clothes sdbc = new Snapback(dbc);
    System.out.println("Fashion : "+sdbc.getDescription());
    System.out.println("Score : "+sdbc.score());
  }
}
