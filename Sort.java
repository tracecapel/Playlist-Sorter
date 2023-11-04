import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;



/**
 * The Sort class contains methods for sorting a playlist of songs by title, artist, or duration.
 */
public class Sort {

    /**
     * Sorts the playlist by song title in alphabetical order (A-Z).
     *
     * @param playlist An ArrayList of Song objects representing the playlist to be sorted.
     * @throws FileNotFoundException if the source file "playlist.txt" is not found.
     */
    public static void sortByTitle(ArrayList<Song> playlist) throws FileNotFoundException {
        File playlistData = new File("playlist.txt");
        Scanner scnr = new Scanner(playlistData);

        while (scnr.hasNextLine()) {
            String temp = scnr.nextLine();
            temp = temp.trim();
            String songName = temp.substring(0, temp.indexOf(","));
            String artistName = temp.substring(temp.indexOf(",") + 1, temp.lastIndexOf(","));
            String durationString = temp.substring(temp.lastIndexOf(",") + 1);
            double duration = Double.parseDouble(durationString);

            Song song = new Song(songName, artistName, duration);
            playlist.add(song);
        }

        Collections.sort(playlist, new Comparator<Song>() {
            @Override
            public int compare(Song song1, Song song2) {
                return song1.getTitle().compareTo(song2.getTitle());
            }
        });

        for (int i = 0; i < playlist.size(); i++) {
            Song currentSong = playlist.get(i);
            System.out.println(currentSong.getTitle() + " by " + currentSong.getArtist() + " - " + currentSong.getTime());
        }
    }

    /**
     * Sorts the playlist by artist's name in alphabetical order (A-Z).
     *
     * @param playlist An ArrayList of Song objects representing the playlist to be sorted.
     * @throws FileNotFoundException if the source file "playlist.txt" is not found.
     */
    public static void sortByArtist(ArrayList<Song> playlist) throws FileNotFoundException {
        File playlistData = new File("playlist.txt");
        Scanner scnr = new Scanner(playlistData);

        while (scnr.hasNextLine()) {
            String temp = scnr.nextLine();
            temp = temp.trim();
            String songName = temp.substring(0, temp.indexOf(","));
            String artistName = temp.substring(temp.indexOf(",") + 1, temp.lastIndexOf(","));
            String durationString = temp.substring(temp.lastIndexOf(",") + 1);
            double duration = Double.parseDouble(durationString);

            Song song = new Song(songName, artistName, duration);
            playlist.add(song);
        }

        Collections.sort(playlist, new Comparator<Song>() {
            @Override
            public int compare(Song song1, Song song2) {
                return song1.getArtist().compareTo(song2.getArtist());
            }
        });

        for (int i = 0; i < playlist.size(); i++) {
            Song currentSong = playlist.get(i);
            System.out.println(currentSong.getTitle() + " by " + currentSong.getArtist() + " - " + currentSong.getTime());
        }
    }

    /**
     * Sorts the playlist by song duration from longest to shortest.
     *
     * @param playlist An ArrayList of Song objects representing the playlist to be sorted.
     * @throws FileNotFoundException if the source file "playlist.txt" is not found.
     */
    public static void sortByDuration(ArrayList<Song> playlist) throws FileNotFoundException {
        File playlistData = new File("playlist.txt");
        Scanner scnr = new Scanner(playlistData);

        while (scnr.hasNextLine()) {
            String temp = scnr.nextLine();
            temp = temp.trim();
            String songName = temp.substring(0, temp.indexOf(","));
            String artistName = temp.substring(temp.indexOf(",") + 1, temp.lastIndexOf(","));
            String durationString = temp.substring(temp.lastIndexOf(",") + 1);
            double duration = Double.parseDouble(durationString);

            Song song = new Song(songName, artistName, duration);
            playlist.add(song);
        }

        Collections.sort(playlist, new Comparator<Song>() {
            @Override
            public int compare(Song song1, Song song2) {
                if (song1.getTime() < song2.getTime()) {
                    return 1;
                } else if (song1.getTime() > song2.getTime()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        for (int i = 0; i < playlist.size(); i++) {
            Song currentSong = playlist.get(i);
            System.out.println(currentSong.getTitle() + " by " + currentSong.getArtist() + " - " + currentSong.getTime());
        }
    }
}
