package com.j2.w14.proxy;
import java.rmi.*;

public interface GumballMachineRemote extends Remote {
  public int getCount() throws RemoteException;
  public String getLocation() throws RemoteException;
  public State getState() throws RemoteException;
}