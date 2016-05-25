package com.j2.w12.iterator;
import java.util.*;

public class MenuTestDrive {
  public static void main(String args[]) {
    PancakeHouseMenu phm = new PancakeHouseMenu();
    DinerMenu dm = new DinerMenu();
    Waitress wt = new Waitress(phm, dm);
    wt.printMenu();
  }
}