package com.j2.w10.facade;

public class Pens {
  public void openPencilcase() {
    System.out.println("Open your pencilcase and pick up pen.");
  }
  public void writeNote() {
    System.out.println("Writing what you study in your note");
  }
  public void highlight(int line) {
    System.out.println("Highlighting line number "+line);
  }
  public void closePencilcase() {
    System.out.println("Put pens in pencilcase and Close.");
  }
}