package com.j2.w13.vidplayer;

public class VideoPlayingState implements State {
  VideoPlayer vp;
  public VideoPlayingState(VideoPlayer vp) {
    this.vp = vp;
  }
  
  public void playingVideo() {
    System.out.println("Video is playing now.");
  }
  public void endVideo() {
    System.out.println("Video is finished. Start to Sleeping...");
    vp.setState(vp.getVideoSleepingState());
  }
  public void pauseVideo() {
    System.out.println("You pause this Video.");
    vp.setState(vp.getVideoSleepingState());
  }
  public void offVideo() {
    System.out.println("Off this video.");
    vp.setState(vp.getVideoOffState());
  }
  
  public String toString() {
    return "Video is playing.";
  }

}