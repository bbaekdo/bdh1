package com.j2.w9.undo;

public class RemoteDvD {
  public static void main(String[] args) {
    RemoteControlWithUndo rc = new RemoteControlWithUndo();
    
    DvDPlayer dvdPlayer = new DvDPlayer();
    DvDPlayerPlayCommand dvdplay = new DvDPlayerPlayCommand(dvdPlayer);
    DvDPlayerStopCommand dvdstop = new DvDPlayerStopCommand(dvdPlayer);
    
    rc.setCommand(0, dvdplay, dvdstop);
 
    rc.onButtonWasPushed(0);
    rc.offButtonWasPushed(0);
    System.out.println(rc);
    rc.undoButtonWasPushed();
    
    rc.offButtonWasPushed(0);
    rc.onButtonWasPushed(0);
    System.out.println(rc);
    rc.undoButtonWasPushed();
  }
}