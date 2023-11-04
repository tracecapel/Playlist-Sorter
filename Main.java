import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class represents the main application that sorts a playlist of songs.
 * It allows the user to select a sorting option and then sorts the playlist accordingly.
 */
public class Main {
    /**
     * The main entry point of the application.
     *
     * @param args Command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
        ArrayList<Song> playlist = new ArrayList<>();
        Scanner scnr2 = new Scanner(System.in);

        System.out.println("How would you like your playlist sorted?");
        System.out.println("Option 1: By title (A-Z)");
        System.out.println("Option 2: By artist (A-Z)");
        System.out.println("Option 3: By duration (Longest to Shortest)");

        int choice = scnr2.nextInt();

        if (choice == 1) {
            try {
                Sort.sortByTitle(playlist);
            } catch (FileNotFoundException e) {
                System.out.println("Could not find source file");
            }
        }

        if (choice == 2) {
            try {
                Sort.sortByArtist(playlist);
            } catch (FileNotFoundException e) {
                System.out.println("Could not find source file");
            }
        }

        if (choice == 3) {
            try {
                Sort.sortByDuration(playlist);
            } catch (FileNotFoundException e) {
                System.out.println("Could not find source file");
            }
        }
    }
}
