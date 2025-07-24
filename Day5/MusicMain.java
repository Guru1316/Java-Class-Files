// MusicMain.java
import java.util.Scanner;
import java.io.IOException;

public class MusicMain {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of songs: ");
        int totalSongs = sc.nextInt();
        sc.nextLine(); // consume newline

        Songs[] songs = new Songs[totalSongs];

        // Input Songs
        for (int i = 0; i < totalSongs; i++) {
            System.out.println("\nEnter details for Song " + (i + 1));
            System.out.print("Title: ");
            String title = sc.nextLine();

            System.out.print("Length (in minutes): ");
            int length = sc.nextInt();
            sc.nextLine(); // consume newline

            songs[i] = new Songs(title, length);
        }

        // Display Songs
        System.out.println("\n--- All Songs ---");
        for (Songs song : songs) {
            System.out.println(song);
        }

        // Create Playlists
        System.out.print("\nEnter number of playlists to create: ");
        int totalPlaylists = sc.nextInt();
        sc.nextLine(); // consume newline

        Playlists[] playlists = new Playlists[totalPlaylists];

        for (int i = 0; i < totalPlaylists; i++) {
            System.out.println("\nEnter details for Playlist " + (i + 1));
            System.out.print("Playlist Name: ");
            String pname = sc.nextLine();

            int numSongs;
            while (true) {
                System.out.print("Number of Songs in this playlist: ");
                numSongs = sc.nextInt();
                sc.nextLine(); // consume newline
                if (numSongs <= totalSongs) break;
                System.out.println("⚠️ Number of songs exceeds total available songs (" + totalSongs + "). Try again.");
            }

            playlists[i] = new Playlists(pname, numSongs);
        }

        // Display Playlists
        System.out.println("\n--- All Playlists ---");
        for (Playlists playlist : playlists) {
            System.out.println(playlist);
        }

        sc.close();
    }
}
