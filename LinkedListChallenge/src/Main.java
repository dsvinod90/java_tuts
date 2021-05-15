import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
  public static Scanner scanner = new Scanner(System.in);

  public static ArrayList<Album> albums = new ArrayList<>();

  public static LinkedList<Song> playlist = new LinkedList<>();

  public static void main(String[] args) {
    System.out.println("WELCOME TO THE MOST USELESS PLAYLIST IN THE WORLD");
    System.out.println();
    createAlbums();
    createSongs();
    displayAlbumDetails();
    createPlaylist();
    boolean quit = false;
    boolean goingForward = true;
    ListIterator<Song> listIterator = playlist.listIterator();
    System.out.println();
    if (playlist.isEmpty()) {
      System.out.println("There are no songs in the playlist!");
      return;
    } else {
      Song song = listIterator.next();
      System.out.println("Now Playing: ");
      System.out.println(song.getTitle() + " -- " + song.getDuration() + " seconds ");
      System.out.println();
      System.out.println("*****************************************************************");
      System.out.println();
      printList();
    }
    while(!quit) {
      System.out.println();
      System.out.print("Enter a choice: ");
      int choice = scanner.nextInt();
      switch (choice) {
        case 0:
          Song song = null;
          if (goingForward && listIterator.hasPrevious()) {
            song = listIterator.previous();
            goingForward = false;
          } else if (!goingForward && listIterator.hasNext()) {
            song = listIterator.next();
            goingForward = true;
          }
          System.out.println("+++++++++++++++++++++ Re-playing: +++++++++++++++++++++++++++");
          System.out.println(song.getTitle() + " -- " + song.getDuration() + " seconds ");
          break;
        case 1:
          if (!goingForward) {
            if (listIterator.hasNext()) {
              listIterator.next();
            }
            goingForward = true;
          }
          if (listIterator.hasNext()) {
            Song nextSong = listIterator.next();
            System.out.println("+++++++++++++++++++++ Skipping To The Next Song: +++++++++++++++++++++++++++");
            System.out.println("Now Playing --> " + nextSong.getTitle() + " (" + nextSong.getDuration() + " seconds)");
          } else {
            System.out.println("We have reached the end of the playlist");
          }
          break;
        case 2:
          if (goingForward) {
            if (listIterator.hasPrevious()) {
              listIterator.previous();
            }
            goingForward = false;
          }
          if (listIterator.hasPrevious()) {
            Song previousSong = listIterator.previous();
            System.out.println("+++++++++++++++++++++ Skipping To The Previous Song: +++++++++++++++++++++++++++");
            System.out.println("Now Playing --> " + previousSong.getTitle() + " (" + previousSong.getDuration() + " seconds)");
          } else {
            System.out.println("We have reached the beginning of the playlist");
          }
          break;
        case 3:
          quit = true;
          System.out.println("Stopping Playlist...");
          System.out.println("Exiting...");
          break;
        case 4:
          printList();
          break;
      }
    }
  }

  public static void createAlbums() {
    System.out.println("+++++++++++++++++++++ Creating Albums: ++++++++++++++++++++++++++++");
    System.out.print("Enter the number of albums to be created: ");
    int count = scanner.nextInt();
    scanner.nextLine();
    for (int i = 0; i < count; i++) {
      boolean albumExists = false;
      System.out.print("Album Name (" + (i+1) + "): ");
      String albumName = scanner.nextLine();
      System.out.print("Artist Name(" + (i+1) + "): ");
      String artistName = scanner.nextLine();
      for(Album album: albums) {
        if (album.getName().equals(albumName) && album.getArtist().equals(artistName)) {
          albumExists = true;
          i -= 1;
          break;
        }
      }
      if(albumExists) {
        System.out.println(albumName + " by " + artistName +" already exists");
      } else {
        Album album = Album.createAlbum(albumName, artistName);
        albums.add(album);
        System.out.println(albumName + " by " + artistName + " has been added");
      }
    }
    System.out.println("--------------------------------------------------------------");
    System.out.println();
  }

  public static void createSongs() {
    System.out.println("+++++++++++++++++++++ Creating Songs: ++++++++++++++++++++++++++++");
    System.out.print("Enter the number of albums to add songs into: ");
    int albumCount = scanner.nextInt();
    scanner.nextLine();
    for(int j = 0; j < albumCount; j++) {
      boolean albumExists = false;
      System.out.print("Name the album: ");
      String albumName = scanner.nextLine();
      System.out.print("Name the artist: ");
      String artistName = scanner.nextLine();
      Album album = null;
      for (Album value : albums) {
        if (value.getName().equals(albumName) && value.getArtist().equals(artistName)) {
          album = value;
          albumExists = true;
          break;
        }
      }
      if (album == null) {
        j -= 1;
        albumExists = false;
        System.out.println("Album does not exist");
      }
      if (albumExists) {
        System.out.print("Enter the number of songs to add to the album: ");
        int count = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < count; i++) {
          System.out.print("Song Title(" + (i + 1) + "): ");
          String songTitle = scanner.nextLine();
          System.out.print("Song Duration(" + (i + 1) + "): ");
          long songDuration = scanner.nextLong();
          scanner.nextLine();
          Song song = Song.createSong(songTitle, songDuration);
          if (!album.addSong(song)) {
            i -= 1;
          }
        }
        System.out.println("--------------------------------------------------------------");
        System.out.println();
      }
    }
  }

  public static void displayAlbumDetails() {
    System.out.println("+++++++++++++++++++++ Showing Album Details: ++++++++++++++++++++++++++++");
    for(Album album: albums) {
      album.showSongs();
      System.out.println("--------------------------------------------------------------");
      System.out.println();
    }
  }

  public static void createPlaylist() {
    System.out.println("+++++++++++++++++++++ Creating Playlist: ++++++++++++++++++++++++++++");
    System.out.print("Enter the number of songs to be entered in the playlist: ");
    int count = scanner.nextInt();
    scanner.nextLine();
    for (int i = 0; i < count; i++) {
      boolean albumExists = false;
      boolean songExists = false;
      System.out.print("Enter the name of the album: ");
      String album = scanner.nextLine();
      System.out.print("Enter the name of the song: ");
      String song = scanner.nextLine();
      for (Album value: albums) {
        if (value.getName().equals(album)) {
          albumExists = true;
          if (value.addToPlaylist(song, playlist)) {
            songExists = true;
            System.out.println(song + " from " + album + " by " + value.getArtist() + " has been added to the playlist");
            break;
          }
        }
      }
      if (!albumExists || !songExists) {
        i -= 1;
      }
    }
    System.out.println("--------------------------------------------------------------");
    System.out.println();
  }

  public static void printList() {
    System.out.println("Playlist controls: ");
    System.out.println("0 -> Replay the current song\n" +
        "1 -> Play the next song\n" +
        "2 -> Play the previous song\n" +
        "3 -> Quit the playlist\n" +
        "4 -> Print the menu");
  }
}
