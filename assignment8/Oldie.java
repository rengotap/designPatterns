/**
 * Vinyl record, can be converted using songAdapter
 * @author rengotap
 */
public class Oldie implements Tune {

    private String artistName;
    private String songTitle;
    private String recordTitle;
    private String category;
    
    /**
     * Creates a new oldie
     * @param artistName first last
     * @param songTitle song name
     * @param recordTitle record name
     * @param category genre
     */
    public Oldie(String artistName, String songTitle, String recordTitle, String category) {
        this.artistName = artistName;
        this.songTitle = songTitle;
        this.recordTitle = recordTitle;
        this.category = category;
    }

    /**
     * @return first last
     */
    public String getArtistName() {
        return artistName;
    }

    /**
     * @return title : album
     */
    public String getDisplayTitle() {
        return songTitle + " : " + recordTitle;
    }

    /**
     * @return genre
     */
    public String getCategory() {
        return category;
    }

}
