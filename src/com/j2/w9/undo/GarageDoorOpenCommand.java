package com.j2.w9.undo;

public class GarageDoorOpenCommand implements Command {
  GarageDoor garageDoor;
  public GarageDoorOpenCommand(GarageDoor garageDoor) {
    this.garageDoor = garageDoor;
  }
  public void execute() {
    garageDoor.open();
  }
  public void undo() {
  }
}