package com.j2.w12;

public class DinerMenu {
  static final int MAX_ITEMS=3;
  int numberOfItems=0;
  MenuItem[] menuItems;
  public DinerMenu() {
    menuItems=new MenuItem[MAX_ITEMS];
    addItem("BLT","...",true,2.9);
    addItem("BLT","...",true,2.9);
    addItem("BLT","...",true,2.9);
  }
  
  public void addItem(String name, String description, boolean v, double p) {
    MenuItem menuItem = new MenuItem(name, description, v, p);
    if(numberOfItems >=MAX_ITEMS) {
      System.err.println("Error");
    } else {
      menuItems[0]=menuItem;
      numberOfItems=numberOfItems+1;
    }
  }
}