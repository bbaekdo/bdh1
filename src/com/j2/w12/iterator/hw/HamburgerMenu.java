package com.j2.w12.iterator.hw;

public class HamburgerMenu implements Menu {
  static final int MAX_ITEMS = 4;
  int numberOfItems = 0;
  MenuItem[] menuItems;

  public HamburgerMenu() {
    menuItems = new MenuItem[MAX_ITEMS];
    addItem("ġ�����", "����� ġ� ����־� ���� ��ǰ! ġ� �����Ѵٸ� ġ�������.", true, 4.99);
    addItem("�Ұ�����", "������ ȣ��ȣ�� ������ �ʴ� �׻� �α��ִ� �Ұ�����", false, 4.99);
    addItem("�����̽����̽�ġŲ����","�˽��ϰ� �ſ� ġŲ ��Ƽ�� ����ִ�. �ſ� ���� �����Ѵٸ� ��õ", true, 5.49);
    addItem("��ƹ���","�������� �� ���Ű�! �ٸ� ���Ŵ� �ݹ� �Ұ����� ũ���� ����!", true, 5.59);
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
