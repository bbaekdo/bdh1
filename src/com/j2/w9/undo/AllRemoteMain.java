package com.j2.w9.undo;

public class AllRemoteMain {
  public static void main(String[] args) {
    RemoteControlWithUndo rc = new RemoteControlWithUndo();
    
    GarageDoor garageDoor = new GarageDoor();
    Light light = new Light();
    DvDPlayer dvdPlayer = new DvDPlayer();
    
    GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);
    GarageDoorCloseCommand garageClose = new GarageDoorCloseCommand(garageDoor);
    
    LightOnCommand lightOn = new LightOnCommand(light);
    LightOffCommand lightOff = new LightOffCommand(light);
    
    DvDPlayerPlayCommand dvdplay = new DvDPlayerPlayCommand(dvdPlayer);
    DvDPlayerStopCommand dvdstop = new DvDPlayerStopCommand(dvdPlayer);
    
    rc.setCommand(0, garageOpen, garageClose);
    rc.setCommand(1, lightOn, lightOff);
    rc.setCommand(3, dvdplay, dvdstop);
    
    rc.onButtonWasPushed(0);
    rc.offButtonWasPushed(0);
    System.out.println(rc);
    rc.undoButtonWasPushed();
    
    rc.onButtonWasPushed(1);
    rc.offButtonWasPushed(1);
    System.out.println(rc);
    rc.undoButtonWasPushed();
    System.out.println();
    
    rc.onButtonWasPushed(3);
    rc.offButtonWasPushed(3);
    System.out.println(rc);
    rc.undoButtonWasPushed();
    
  }
}