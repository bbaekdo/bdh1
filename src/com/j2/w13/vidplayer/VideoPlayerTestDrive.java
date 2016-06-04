package com.j2.w13.vidplayer;

public class VideoPlayerTestDrive {
  public static void main(String[] args) {
    VideoPlayer vp = new VideoPlayer();
    System.out.println(vp);
    vp.playingVideo();
    vp.pauseVideo();
    System.out.println(vp);
    vp.playingVideo();
    vp.endVideo();
    System.out.println(vp);
    vp.playingVideo();
    vp.offVideo();
    System.out.println(vp);
  }
}