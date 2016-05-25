package com.j2.w12.iterator;

public class Waitress {
  PancakeHouseMenu phm;
  DinerMenu dm;
  public Waitress(PancakeHouseMenu p, DinerMenu d) {
    this.phm=p;
    this.dm=d;
  }
  public void printMenu() {
    Iterator pi = phm.createIterator();
    Iterator di = dm.createIterator();
    System.out.println("----Pancake House Menu----");
    while(pi.hasNext()) {
      MenuItem menuItem= (MenuItem)pi.next();
      System.out.println("Name : "+menuItem.getName()+", ");
      System.out.println("Price : "+menuItem.getPrice());
      System.out.println("description : "+menuItem.getDescription());
      System.out.println();
    }
    System.out.println("----Diner Menu----");
    while(di.hasNext()) {
      MenuItem menuItem= (MenuItem)di.next();
      System.out.println("Name : "+menuItem.getName()+", ");
      System.out.println("Price : "+menuItem.getPrice());
      System.out.println("description : "+menuItem.getDescription());
      System.out.println();
    }
    
  }
}