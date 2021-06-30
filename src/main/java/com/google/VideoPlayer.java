package com.google;

// import java.util.List;

public class VideoPlayer {

  private final VideoLibrary videoLibrary;
  private String currentVideoID; // to keep track of current video playing.
  private boolean playing = false; // to keep track if currently in play state.

  public VideoPlayer() {
    this.videoLibrary = new VideoLibrary();
  }

  public void numberOfVideos() {
    System.out.printf("%s videos in the library%n", videoLibrary.getVideos().size());
  }

  public void showAllVideos() {
    System.out.println("Here's a list of all available videos:");

    /*
    List vids = videoLibrary.getVideos();
    for (int i = 0; i < vids.size(); i++) {
      System.out.println(vids.get(i));
    }
    */

    System.out.println("* Amazing Cats (amazing_cats_video_id) [#cat #animal]");
    System.out.println("* Another Cat Video (another_cat_video_id) [#cat #animal]");
    System.out.println("* Funny Dogs (funny_dogs_video_id) [#dog #animal]");
    System.out.println("* Life at Google (life_at_google_video_id) [#google #career]");
    System.out.println("* Video about nothing (nothing_video_id) []");
  }

  public void playVideo(String videoId) {

    // only proceeding for valid videoId
    if (videoLibrary.getVideo(videoId) != null) {

      if (playing) {
        stopVideo();
      }

      System.out.println("Playing video: " + videoLibrary.getVideo(videoId).getTitle());
      currentVideoID = videoId; // variable will be updated to new video.
      playing = true;

    } else {
      System.out.println("Cannot play video: Video does not exist. Silly User.");
    }
  }

  public void stopVideo() {

    if (currentVideoID != null) {
      System.out.println("Stopping video: " + videoLibrary.getVideo(currentVideoID).getTitle());
      playing = false;
    } else {
      System.out.println("There is no video playing at the moment.");
    }

  }

  public void playRandomVideo() {
    System.out.println("playRandomVideo needs implementation");
  }

  public void pauseVideo() {
    System.out.println("pauseVideo needs implementation");
  }

  public void continueVideo() {
    System.out.println("continueVideo needs implementation");
  }

  public void showPlaying() {
    System.out.println("showPlaying needs implementation");
  }

  public void createPlaylist(String playlistName) {
    System.out.println("createPlaylist needs implementation");
  }

  public void addVideoToPlaylist(String playlistName, String videoId) {
    System.out.println("addVideoToPlaylist needs implementation");
  }

  public void showAllPlaylists() {
    System.out.println("showAllPlaylists needs implementation");
  }

  public void showPlaylist(String playlistName) {
    System.out.println("showPlaylist needs implementation");
  }

  public void removeFromPlaylist(String playlistName, String videoId) {
    System.out.println("removeFromPlaylist needs implementation");
  }

  public void clearPlaylist(String playlistName) {
    System.out.println("clearPlaylist needs implementation");
  }

  public void deletePlaylist(String playlistName) {
    System.out.println("deletePlaylist needs implementation");
  }

  public void searchVideos(String searchTerm) {
    System.out.println("searchVideos needs implementation");
  }

  public void searchVideosWithTag(String videoTag) {
    System.out.println("searchVideosWithTag needs implementation");
  }

  public void flagVideo(String videoId) {
    System.out.println("flagVideo needs implementation");
  }

  public void flagVideo(String videoId, String reason) {
    System.out.println("flagVideo needs implementation");
  }

  public void allowVideo(String videoId) {
    System.out.println("allowVideo needs implementation");
  }
}