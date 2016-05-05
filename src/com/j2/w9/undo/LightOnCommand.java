package com.j2.w9.undo;

public class LightOnCommand implements Command {
  private Light light;
  public LightOnCommand(Light light) {
    this.light = light;
  }
  int level;
  public void execute() {
    level=light.getLevel();
    light.on();
  }
  public void undo() {
    light.dim(level);
  }
}