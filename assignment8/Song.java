/**
 * Abstract song method
 * @author rengotap
 */
public abstract class Song {

    // Abstract methods
    public abstract String getTitle();
    public abstract String getAlbum();
    public abstract String getArtistFirstName();
    public abstract String getArtistLastName();
    public abstract String getGenre();

    /**
     * Formats the song into a string
     * @return song string
     */
    public String toString() {
        return 
            getTitle() + '\n'
            + "Album: " + getAlbum() + '\n'
            + "By: " + getArtistFirstName() + " " + getArtistLastName() +'\n'
            + "Genre: " + getGenre();
    }
}
