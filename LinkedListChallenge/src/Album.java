import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
  private String name;
  private String artist;
  private ArrayList<Song> songs;

  public Album(String name, String artist) {
    this.name = name;
    this.artist = artist;
    this.songs = new ArrayList<>();
  }

  public String getName() {
    return name;
  }

  public String getArtist() {
    return artist;
  }

  public static Album createAlbum(String name, String artist) {
    return new Album(name, artist);
  }

  public boolean addSong(Song song) {
    int position = findSong(song.getTitle());
    if (position < 0) {
      songs.add(song);
      System.out.println(song.getTitle() + " has been successfully added to the album " + name);
      return true;
    } else {
      System.out.println("Song already exists in the album");
      return false;
    }
  }

  public void showSongs() {
    System.out.println("Artist: " + artist);
    System.out.println("Album: " + name);
    System.out.println("Songs: ");
    for (Song song : songs) {
      System.out.println(song.getTitle() + " ---> " + song.getDuration() + " seconds");
    }
  }

  public boolean addToPlaylist(String songName, LinkedList<Song> linkedList) {
    Song song = fetchSong(songName);
    if (song != null) {
      linkedList.add(song);
      return true;
    } else {
      System.out.println("Song not found");
      return false;
    }
  }

  private Song fetchSong(String title) {
    int position = findSong(title);
    if (position >= 0) {
      return songs.get(position);
    } else {
      return null;
    }
  }

  private int findSong(String title) {
    for (int i = 0; i < songs.size(); i++) {
      if (songs.get(i).getTitle().equals(title)) {
        return i;
      }
    }
    return -1;
  }
}
