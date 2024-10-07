import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Album> albums = new ArrayList<>();

        Album album = new Album("Discouraged ones", "Katatonia");
        album.addSong("I Break", 4.24);
        album.addSong("Stalemate", 4.21);
        album.addSong("Deadhouse", 4.37);
        album.addSong("Relention", 3.39);
        album.addSong("Cold Ways", 5.22);
        album.addSong("Gone", 2.49);
        album.addSong("Last Resort", 4.37);
        albums.add(album);

        album = new Album("Konkurs", "Lifelover");
        album.addSong("Shallow", 6.26);
        album.addSong("Mental Central Dialog", 3.59);
        album.addSong("Brand", 4.17);
        album.addSong("Cancertid", 4.56);
        album.addSong("Konvulsion", 3.13);
        albums.add(album);

        LinkedList<Song> doomRock = new LinkedList<Song>();
        albums.get(0).addToPlayList("I Break", doomRock);
        albums.get(0).addToPlayList("Deadhouse", doomRock);
        albums.get(0).addToPlayList(4, doomRock);
        albums.get(1).addToPlayList("Shallow", doomRock);
        albums.get(1).addToPlayList(3, doomRock);

        printAlbumNamesAndSongs(albums);
        printPlaylist(doomRock);
    }

    public static void printAlbumNamesAndSongs(ArrayList<Album> albums) {
        System.out.println("Albums:");
        for (Album album : albums) {
            System.out.println();
            System.out.println("Artist: " + album.getArtist());
            System.out.println("Album: " + album.getName());
            for (Song song : album.getSongs()) {
                System.out.println(" - " + song.getTitle() + ": " + song.getDuration() + " mins");
            }
        }
    }

    public static void printPlaylist(LinkedList<Song> playlist) {
        System.out.println("Playlist:");
        for (Song song : playlist) {
            System.out.println(" - " + song.getTitle() + ": " + song.getDuration() + " mins");
        }
    }
}