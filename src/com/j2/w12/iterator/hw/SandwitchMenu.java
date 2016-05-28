package com.j2.w12.iterator.hw;

public class SandwitchMenu implements Menu {
  static final int MAX_ITEMS = 4;
  int numberOfItems = 0;
  MenuItem[] menuItems;
  
  public SandwitchMenu() {
    menuItems = new MenuItem[MAX_ITEMS];
    addItem("ÂüÄ¡»÷µåÀ§Ä¡", "ÂüÄ¡°¡ »§»§ÇÏ°Ô µé¾îÀÖ´Â ÂüÄ¡»÷µåÀ§Ä¡", true, 2.99);
    addItem("ÇÜ¿¡±×»÷µåÀ§Ä¡", "´Ã ÀÎ±âÀÖ´Â °£ÆÇ¸Þ´º ÇÜ¿¡±×!", false, 2.99);
    addItem("Å¬·´»÷µåÀ§Ä¡","ÂüÄ¡,»ø·¯µå,¸À»ì,Ä¡Áî ´Ù¾çÇÑ Àç·á°¡ °¡µæÇÑ »÷µåÀ§Ä¡", true, 3.49);
    addItem("µð·°½º»÷µåÀ§Ä¡","»ìÂî°í ½ÍÀ¸¸é µµÀüÇØ¶ó! Ä®·Î¸® ÆøÅº »÷µåÀ§Ä¡", true, 4.59);
  }
  public void addItem(String n, String d, boolean v, double p) {
    MenuItem menuItem = new MenuItem(n, d, v, p);
      if (numberOfItems >= MAX_ITEMS) {
        System.err.println("Sorry, menu is full!  Can't add item to menu");
      } else {
        menuItems[numberOfItems] = menuItem;
        numberOfItems = numberOfItems + 1;
      }
  }
  public MenuItem[] getMenuItems() {
    return menuItems;
  }
  public Iterator createIterator() {
    return new SandwitchMenuIterator(menuItems);
  }

}
