package com.j2.w12.iterator.hw;

public class HamburgerMenuIterator implements Iterator {
  MenuItem[] items;
  int position=0;
  public HamburgerMenuIterator(MenuItem[] items) { 
    this.items = items; 
  } 
  public Object next() {
    MenuItem menuItem = items[position];
    position = position+1;
    return menuItem;
  }
  public boolean hasNext() {
    if (position>=items.length || items[position]==null) {
      return false;
    } else {
      return true;
    }
  }
}