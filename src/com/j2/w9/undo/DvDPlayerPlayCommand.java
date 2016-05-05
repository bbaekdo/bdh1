package com.j2.w9.undo;

public class DvDPlayerPlayCommand implements Command {
  DvDPlayer dvdplayer;
  int stopPoint;
  public DvDPlayerPlayCommand(DvDPlayer dvdplayer) {
    this.dvdplayer=dvdplayer;
  }
  public void execute() {
    stopPoint=dvdplayer.getPoint();
    dvdplayer.dvdplay();
  }
  public void undo() {}
}