import java.util.HashMap;

/**
 * Reads songs from a map
 * @author rengotap
 */
public class JukeBox {
    
    private HashMap<String, Song> songs;

    public JukeBox() {
        songs = new HashMap<String, Song>();
    }

    public void addSong(Song song) {
        songs.put(song.getTitle().toLowerCase(), song);
    }

    public void play(String songName) {
        if (songs.get(songName.toLowerCase()) != null) {
            System.out.println(songs.get(songName.toLowerCase()).toString() + '\n');
        } else {
            System.out.println("Song '" + songName + "' not found" + '\n');
        }
    }
}
