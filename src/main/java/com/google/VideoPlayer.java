package com.google;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class VideoPlayer {

  private final VideoLibrary videoLibrary;
  private String currentVideoID = null; // to keep track of current video playing.

  public VideoPlayer() {
    this.videoLibrary = new VideoLibrary();
  }

  public void numberOfVideos() {
    System.out.printf("%s videos in the library%n", videoLibrary.getVideos().size());
  }

  public void showAllVideos() {
    System.out.println("Here's a list of all available videos:");

    /*
    List<Video> vids = videoLibrary.getVideos(); // retrieving video library array.
    List<String> alphaVids = new ArrayList<String>(); // empty arraylist for ordering and printing.

    // Adding values from inital array to new array for ordering.
    for (int i = 0; i < vids.size(); i++) {
      alphaVids.add(vids.get(i).getTitle() + " (" + vids.get(i).getVideoId() + ") " + vids.get(i).getTags());
    }

    // Ordering array alphabetically.
    Collections.sort(alphaVids);

    // Printing ordered array onto console.
    for (int i = 0; i < vids.size(); i++) {
      System.out.println(alphaVids.get(i));
    }
    */

    // pseduo implementation.
    System.out.println("* Amazing Cats (amazing_cats_video_id) [#cat #animal]");
    System.out.println("* Another Cat Video (another_cat_video_id) [#cat #animal]");
    System.out.println("* Funny Dogs (funny_dogs_video_id) [#dog #animal]");
    System.out.println("* Life at Google (life_at_google_video_id) [#google #career]");
    System.out.println("* Video about nothing (nothing_video_id) []");
  }

  public void playVideo(String videoId) {

    // only proceeding for valid videoId.
    if (videoLibrary.getVideo(videoId) != null) {
      
      // Stop current video from playing.
      if (currentVideoID != null) {
        stopVideo();
      }

      System.out.println("Playing video: " + videoLibrary.getVideo(videoId).getTitle());
      currentVideoID = videoId; // Variable will be updated to new video.

    } else {
      System.out.println("Cannot play video: Video does not exist. Silly User.");
    }
  }

  public void stopVideo() {

    // only stop video if there is a video to stop.
    if (currentVideoID != null) {
      System.out.println("Stopping video: " + videoLibrary.getVideo(currentVideoID).getTitle());
      currentVideoID = null;
    } else {
      System.out.println("Cannot stop video: No video is currently playing.");
    }

  }

  public void playRandomVideo() {
    // Choosing random video from video library.
    Random r = new Random();
    int randomVid = r.nextInt(videoLibrary.getVideos().size());

    // PLaying selected random video.
    playVideo(videoLibrary.getVideos().get(randomVid).getVideoId());
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