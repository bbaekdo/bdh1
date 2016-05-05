package com.j2.w9;

public class GarageDoorCloseCommand implements Command {
  GarageDoor garageDoor;
  public GarageDoorCloseCommand(GarageDoor garageDoor) {
    this.garageDoor = garageDoor;
  }
  public void execute() {
    garageDoor.close();
  }
  
}