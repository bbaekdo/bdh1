package com.j2.w13.vidplayer;

public class VideoSleepingState implements State {
  VideoPlayer vp;
  public VideoSleepingState(VideoPlayer vp) {
    this.vp = vp;
  }
  public void playingVideo() {
    System.out.println("Re-play the video");
    vp.setState(vp.getVideoPlayingState());
  }
  public void endVideo() {
    System.out.println("Now is Sleeping mode.. Can't end video");
  }
  public void pauseVideo() {
    System.out.println("Now is Sleeping mode.. Can't pause again");
  }
  
  public void offVideo() {
    System.out.println("Off this video.");
    vp.setState(vp.getVideoOffState());
  }
  
  public String toString() {
    return "Video is sleeping.";
  }

}