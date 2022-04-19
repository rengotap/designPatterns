/**
 * Converts an oldie to a track like format
 * @author rengotap
 */
public class SongAdapter extends Song {
    
    private Tune tune;

    /**
     * creates a new adapter
     * @param tune
     */
    public SongAdapter(Tune tune) {
        this.tune = tune;
    }

    /**
     * @return song name
     */
    public String getTitle() {
        return tune.getDisplayTitle().split(" : ")[0];
    }

    /**
     * @return album/record name
     */
    public String getAlbum() {
        return tune.getDisplayTitle().split(" : ")[1];
    }

    /**
     * @return artist firstname
     */
    public String getArtistFirstName() {
        return tune.getArtistName().split(" ")[0];
    }

    /**
     * @return artist lastname
     */
    public String getArtistLastName() {
        return tune.getArtistName().split(" ")[1];
    }

    /**
     * @return genre/category name
     */
    public String getGenre() {
        return tune.getCategory();
    }
}
