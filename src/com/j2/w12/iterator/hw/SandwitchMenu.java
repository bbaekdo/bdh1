package com.j2.w12.iterator.hw;

public class SandwitchMenu implements Menu {
  static final int MAX_ITEMS = 4;
  int numberOfItems = 0;
  MenuItem[] menuItems;
  
  public SandwitchMenu() {
    menuItems = new MenuItem[MAX_ITEMS];
    addItem("��ġ������ġ", "��ġ�� �����ϰ� ����ִ� ��ġ������ġ", true, 2.99);
    addItem("�ܿ��׻�����ġ", "�� �α��ִ� ���Ǹ޴� �ܿ���!", false, 2.99);
    addItem("Ŭ��������ġ","��ġ,������,����,ġ�� �پ��� ��ᰡ ������ ������ġ", true, 3.49);
    addItem("�𷰽�������ġ","����� ������ �����ض�! Į�θ� ��ź ������ġ", true, 4.59);
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
