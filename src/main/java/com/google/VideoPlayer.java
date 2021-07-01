package com.google;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;
import java.util.Random;

public class VideoPlayer {

  private final VideoLibrary videoLibrary;
  private String currentVideoID = null; // to keep track of current video playing.
  private boolean paused = false; // to keep track of whether video is in pause state/
  private Map<String, List<String>> playlists= new HashMap<>(); // keeping track of playlists using hashmap, with key linked to list of ids

  public VideoPlayer() {
    this.videoLibrary = new VideoLibrary();
  }

  public void numberOfVideos() {
    System.out.printf("%s videos in the library%n", videoLibrary.getVideos().size());
  }

  public void showAllVideos() {
    System.out.println("Here's a list of all available videos:");

    List<Video> vids = videoLibrary.getVideos(); // retrieving video library array.
    List<String> alphaVids = new ArrayList<String>(); // empty arraylist for ordering and printing.
    String appVal; // String to append to empty arraylist.

    // Adding values from inital array to new array for ordering.
    for (int i = 0; i < vids.size(); i++) {
      appVal = vids.get(i).getTitle() + " (" + vids.get(i).getVideoId() + ") " + "[";

      // adding tags to the end of the input seperately before placing into array
      for (int j = 0; j < vids.get(i).getTags().size(); j++) {
        appVal += vids.get(i).getTags().get(j);
        if (j != vids.get(i).getTags().size()-1) {appVal += " ";} // Should only add space if not last value.
      }
      appVal += "]";

      // Placing into array to be ordered.
      alphaVids.add(appVal);
    }

    // Ordering array alphabetically.
    Collections.sort(alphaVids);

    // Printing ordered array onto console.
    for (int i = 0; i < vids.size(); i++) {
      System.out.println(alphaVids.get(i));
    }
  }

  public void playVideo(String videoId) {

    // only proceeding for valid videoId.
    if (videoLibrary.getVideo(videoId) != null) {
      
      // Stop current video from playing.
      if (currentVideoID != null) {stopVideo();}

      // unpause
      if (paused) {paused = false;}

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
    // checking if there is a video to pause.
    if (currentVideoID != null) {
      // checking if already paused.
      if (paused) {
        System.out.println("Video already paused: " +  videoLibrary.getVideo(currentVideoID).getTitle());
      } else {
        System.out.println("Pausing video: " + videoLibrary.getVideo(currentVideoID).getTitle());
        paused = true;
      }
    } else {
      System.out.println("Cannot pause video: No video is currently playing");
    }

  }

  public void continueVideo() {
    // checking if there is a video to continue.
    if (currentVideoID != null) {
      // checking if already playing.
      if (paused) {
        System.out.println("Continuing video: " + videoLibrary.getVideo(currentVideoID).getTitle());
        paused = false;
      } else {
        System.out.println("Cannot continue video: Video is not paused");
      }
    } else {
      System.out.println("Cannot continue video: No video is currently playing");
    }
  }

  public void showPlaying() {

    if (currentVideoID != null) {
      //System.out.println("Currently playing: Amazing Cats (amazing_cats_video_id) [#cat #animal]"); //psedo code.

      // Preparing printout.
      String printOut = "Currently playing: " + 
                      videoLibrary.getVideo(currentVideoID).getTitle() + " (" + 
                      videoLibrary.getVideo(currentVideoID).getVideoId() + ") " +
                       "[";

      // adding tags to the end of the input seperately before placing into array
      for (int j = 0; j < videoLibrary.getVideo(currentVideoID).getTags().size(); j++) {
        printOut += videoLibrary.getVideos().get(j).getTags().get(j);
        if (j != videoLibrary.getVideos().get(j).getTags().size()-1) {printOut += " ";} // Should only add space if not last value.
      }
      printOut += "]";

      // paused state check.
      if (paused) {printOut += " - PAUSED";}

      // Finally, printing out.
      System.out.println(printOut);

    } else {
      System.out.println("No video is currently playing. Foolish user.");
    }

  }

  public void createPlaylist(String playlistName) {
    // only add to playlists list if not already there.
    if (!playlists.containsKey(playlistName.toLowerCase())) {
      playlists.put(playlistName.toLowerCase(), null); // all playlists are case insensitive.
      System.out.println("Successfully created new playlist: " + playlistName);
    } else {
      System.out.println("Cannot create playlist: A playlist with the same name already exists");
    }
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