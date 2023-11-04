/**
 * The Song class represents a song with a title, artist, and duration.
 */
public class Song {
    private String title;
    private String artist;
    private double time;

    /**
     * Constructs a new Song object with the specified title, artist, and duration.
     *
     * @param title  The title of the song.
     * @param artist The artist or performer of the song.
     * @param time   The duration of the song in minutes.
     */
    public Song(String title, String artist, double time) {
        this.title = title;
        this.artist = artist;
        this.time = time;
    }

    /**
     * Retrieves the title of the song.
     *
     * @return The title of the song.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title of the song.
     *
     * @param title The new title of the song.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Retrieves the artist or performer of the song.
     *
     * @return The artist or performer of the song.
     */
    public String getArtist() {
        return artist;
    }

    /**
     * Sets the artist or performer of the song.
     *
     * @param artist The new artist or performer of the song.
     */
    public void setArtist(String artist) {
        this.artist = artist;
    }

    /**
     * Retrieves the duration of the song in minutes.
     *
     * @return The duration of the song in minutes.
     */
    public double getTime() {
        return time;
    }

    /**
     * Sets the duration of the song in minutes.
     *
     * @param time The new duration of the song in minutes.
     */
    public void setTime(double time) {
        this.time = time;
    }
}
