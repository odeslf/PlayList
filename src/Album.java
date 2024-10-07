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

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public String getArtist() {
        return artist;
    }

    public boolean addSong(String title, double duration) {
        Song foundTrack = findSong(title);
        if (foundTrack != null) {
            return false;
        }
        songs.add(new Song(title, duration));
        return true;
    }

    public Song findSong(String title) {
        for (int i = 0; i < songs.size(); i++) {
            if (songs.get(i).getTitle().equals(title)) {
                return songs.get(i);
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        int index = trackNumber - 1;
        if (index>= 0 && index < songs.size()) {
            playList.add(songs.get(index));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song foundTrack = findSong(title);
        if (foundTrack != null) {
            playList.add(foundTrack);
            return true;
        }
        return false;
    }
}
