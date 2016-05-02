package com.j2.w9;

public class GarageDoorOpenCommand implements Command {
  GarageDoor garageDoor;
  public GarageDoorOpenCommand(GarageDoor garageDoor) {
    this.garageDoor = garageDoor;
  }
  public void execute() {
    garageDoor.open();
  }
}