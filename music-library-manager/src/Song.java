public class Song {
    // Encapsulated variables
    private String name;
    private String artist;
    private int duration;

    // Constructor
    Song(String name, String artist, int duration) {
        this.name = name;
        this.artist = artist;
        this.duration = duration;
    }

    // Getters / Setters
    public String getName() {
        return name;
    }
    public String getArtist() {
        return artist;
    }
    public int getDuration() {
        return duration;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
}
