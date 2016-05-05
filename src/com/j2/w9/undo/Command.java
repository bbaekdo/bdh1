package com.j2.w9.undo;

public interface Command {
  public void execute();
  public void undo();
}