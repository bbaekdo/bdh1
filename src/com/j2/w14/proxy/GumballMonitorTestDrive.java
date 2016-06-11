package com.j2.w14.proxy;

import java.rmi.*;

public class GumballMonitorTestDrive {
  public static void main(String[] args) {
    String[] location = {
      "rmi://localhost/gumballmachine",
      "rmi://localhost/gumballmachine",
      "rmi://localhost/gumballmachine"
    }; 
    GumballMonitor[] monitor = new GumballMonitor[location.length];
    for (int i=0;i < location.length; i++) {
      try {
        GumballMachineRemote machine = 
          (GumballMachineRemote) Naming.lookup(location[i]);
        monitor[i] = new GumballMonitor(machine);
        System.out.println(monitor[i]);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    
    for(int i=0; i < monitor.length; i++) {
      monitor[i].report();
    }
  }
}
