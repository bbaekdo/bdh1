package com.j2.w12.iterator.hw;

public class Waitress {
  HamburgerMenu hm;
  JuiceMenu jm;
  SandwitchMenu sm;
  public Waitress(HamburgerMenu h, JuiceMenu j, SandwitchMenu s) {
    this.hm=h;
    this.jm=j;
    this.sm=s;
  }
  public void printMenu() {
    Iterator hi = hm.createIterator();
    Iterator ji = jm.createIterator();
    Iterator si = sm.createIterator();
    System.out.println("----Hamburger Set Menu----");
    while(hi.hasNext()) {
      MenuItem menuItem= (MenuItem)hi.next();
      System.out.println("Name : "+menuItem.getName()+", ");
      System.out.println("Price : "+menuItem.getPrice());
      System.out.println("description : "+menuItem.getDescription());
      System.out.println();
    }
    System.out.println("----Juice Menu----");
    while(ji.hasNext()) {
      MenuItem menuItem= (MenuItem)ji.next();
      System.out.println("Name : "+menuItem.getName()+", ");
      System.out.println("Price : "+menuItem.getPrice());
      System.out.println("description : "+menuItem.getDescription());
      System.out.println();
    }
    System.out.println("----Sandwitch Menu----");
    while(si.hasNext()) {
      MenuItem menuItem= (MenuItem)si.next();
      System.out.println("Name : "+menuItem.getName()+", ");
      System.out.println("Price : "+menuItem.getPrice());
      System.out.println("description : "+menuItem.getDescription());
      System.out.println();
    }
    
  }
}