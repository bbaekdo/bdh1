package com.j2.w12.iterator.hw;

public class HamburgerMenu implements Menu {
  static final int MAX_ITEMS = 4;
  int numberOfItems = 0;
  MenuItem[] menuItems;

  public HamburgerMenu() {
    menuItems = new MenuItem[MAX_ITEMS];
    addItem("치즈버거", "고소한 치즈가 들어있어 맛이 일품! 치즈를 좋아한다면 치즈버거지.", true, 4.99);
    addItem("불고기버거", "남녀노소 호불호가 갈리지 않는 항상 인기있는 불고기버거", false, 4.99);
    addItem("상하이스파이스치킨버거","알싸하게 매운 치킨 패티가 들어있다. 매운 맛을 좋아한다면 추천", true, 5.49);
    addItem("빅맥버거","버거위에 또 버거가! 다른 버거는 반박 불가능한 크기의 버거!", true, 5.59);
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
    return new HamburgerMenuIterator(menuItems);
  }
 
}
