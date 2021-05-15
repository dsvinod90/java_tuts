public class Song {
  private String title;
  private long duration;

  public Song(String title, long duration) {
    this.title = title;
    this.duration = duration;
  }

  public String getTitle() {
    return title;
  }

  public long getDuration() {
    return duration;
  }

  public static Song createSong(String title, long duration) {
    return new Song(title, duration);
  }
}
