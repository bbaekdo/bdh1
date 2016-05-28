package com.j2.w12.iterator.hw;

public class JuiceMenu implements Menu {
  static final int MAX_ITEMS = 6;
  int numberOfItems = 0;
  MenuItem[] menuItems;
  
  public JuiceMenu() {
    menuItems = new MenuItem[MAX_ITEMS];
    addItem("청포도에이드","상큼한 맛이 일품인 청포도에이드", true, 3.29);
    addItem("레몬에이드","레몬을 좋아하는 당신에게 취향저격!", false, 3.29);
    addItem("자몽에이드","씁쓰름한 자몽 본연의 맛을 그대로 느낄수 있어!", false, 3.29);
    addItem("우유","부드럽게 당신의 속을 달래줄 우유", false, 2.29);
    addItem("콜라","톡 쏘는 걸 좋아하신다면 바로 콜라", true, 1.99);
    addItem("미숫가루","남녀노소 누구나 사랑하는 고소한 미숫가루", true, 2.99);
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
    return new JuiceMenuIterator(menuItems);
  }
}
