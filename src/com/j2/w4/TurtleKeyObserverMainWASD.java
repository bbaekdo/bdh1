package com.j2.w4;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import ch.aplu.turtle.*;

class TurtleKeyListener extends Turtle {
  public TurtleKeyListener() {
    addKeyListener(new KeyAdapter() {
    public void keyPressed(KeyEvent e) {
      int keyCode= e.getKeyCode();
      switch(keyCode) {
        case KeyEvent.VK_W:
          setStatusText("forward 20");
          forward(20);
          break;
        case KeyEvent.VK_S:
          setStatusText("back 20");
          back(20);
          break;
        case KeyEvent.VK_A:
          setStatusText("turn left");
          left(90);
          break;
        case KeyEvent.VK_D:
          setStatusText("turn right");
          right(90);
          break;
        case KeyEvent.VK_Q:
          setStatusText("q pressed and exiting");
          break;
    }
    }
    });
  }
}

public class TurtleKeyObserverMainWASD {
  public static void main(String[] args) {
    TurtleKeyListener t=new TurtleKeyListener();
    t.addStatusBar(20);
    t.setStatusText("Press any key!");
  }
}