package com.j2.w9.undo;

public class DvDPlayerStopCommand implements Command {
  DvDPlayer dvdplayer;
  int stopPoint;
  public DvDPlayerStopCommand(DvDPlayer dvdplayer) {
    this.dvdplayer=dvdplayer;
  }
  public void execute() {
    stopPoint=dvdplayer.getPoint();
    dvdplayer.dvdstop();
  }
  public void undo() {
    dvdplayer.stopPoint();
  }
}