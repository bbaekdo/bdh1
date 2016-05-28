package com.j2.w12.iterator.hw;

public class JuiceMenu implements Menu {
  static final int MAX_ITEMS = 6;
  int numberOfItems = 0;
  MenuItem[] menuItems;
  
  public JuiceMenu() {
    menuItems = new MenuItem[MAX_ITEMS];
    addItem("û�������̵�","��ŭ�� ���� ��ǰ�� û�������̵�", true, 3.29);
    addItem("�����̵�","������ �����ϴ� ��ſ��� ��������!", false, 3.29);
    addItem("�ڸ����̵�","�������� �ڸ� ������ ���� �״�� ������ �־�!", false, 3.29);
    addItem("����","�ε巴�� ����� ���� �޷��� ����", false, 2.29);
    addItem("�ݶ�","�� ��� �� �����ϽŴٸ� �ٷ� �ݶ�", true, 1.99);
    addItem("�̼�����","������ ������ ����ϴ� ����� �̼�����", true, 2.99);
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
