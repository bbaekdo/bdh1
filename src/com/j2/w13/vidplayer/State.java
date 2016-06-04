package com.j2.w13.vidplayer;

public interface State {
  public void playingVideo();
  public void endVideo();
  public void pauseVideo();
  public void offVideo();
}