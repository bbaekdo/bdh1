package com.j2.w13.vidplayer;

public class VideoOffState implements State {
  VideoPlayer vp;
  public VideoOffState(VideoPlayer vp) {
    this.vp = vp;
  }
  public void playingVideo() {
    System.out.println("Play video? Ready to play");
    vp.setState(vp.getVideoPlayingState());
  }
  public void endVideo() {
    System.out.println("Now Video off.. Can't end video");
  }
  public void pauseVideo() {
    System.out.println("Now Video off.. Can't pause again");
  }
  public void offVideo() {
    System.out.println("Already video is off.");
  }
  
  public String toString() {
    return "Video is off now.";
  }

}