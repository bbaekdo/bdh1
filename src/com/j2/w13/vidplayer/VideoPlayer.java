package com.j2.w13.vidplayer;

public class VideoPlayer {
  State videoOffState;
  State videoPlayingState;
  State videoSleepingState;
  State state;
  
  public VideoPlayer() {
    videoOffState = new VideoOffState(this);
    videoPlayingState = new VideoPlayingState(this);
    videoSleepingState = new VideoSleepingState(this);
    state = videoOffState;
  }
  
  public void playingVideo() {
    state.playingVideo();
  }
  public void endVideo() {
    state.endVideo();
  }
  public void pauseVideo() {
    state.pauseVideo();
  }
  public void offVideo() {
    state.offVideo();
  }
  
  void setState(State state) {
    this.state=state;
  }
  
  public State getState() {
    return state;
  }
  
  public State getVideoPlayingState() {
    return videoPlayingState;
  }
  
  public State getVideoSleepingState() {
    return videoSleepingState;
  }
  
  public State getVideoOffState() {
    return videoOffState;
  }
  
  public String toString() {
    StringBuffer result = new StringBuffer();
    result.append("VideoPlayer State ---> " + state+ "\n"); 
    return result.toString(); 
  } 
}