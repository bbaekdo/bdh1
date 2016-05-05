package com.j2.w9.undo;

public class LightOffCommand implements Command {
  private Light light;
  public LightOffCommand(Light light) {
    this.light = light;
  }
  int level;
  public void execute() {
    level=light.getLevel();
    light.off();
  }
  public void undo() {
    light.dim(level);
  }
}