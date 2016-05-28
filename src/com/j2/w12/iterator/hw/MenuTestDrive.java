package com.j2.w12.iterator.hw;
import java.util.*;

public class MenuTestDrive {
  public static void main(String args[]) {
    HamburgerMenu hm = new HamburgerMenu();
    JuiceMenu jm = new JuiceMenu();
    SandwitchMenu sm = new SandwitchMenu();
    Waitress wt = new Waitress(hm, jm, sm);
    wt.printMenu();
  }
}