package com.j2.w9.undo;

public class GarageDoorCloseCommand implements Command {
  GarageDoor garageDoor;
  public GarageDoorCloseCommand(GarageDoor garageDoor) {
    this.garageDoor = garageDoor;
  }
  public void execute() {
    garageDoor.close();
  }
  public void undo() {
  }
}