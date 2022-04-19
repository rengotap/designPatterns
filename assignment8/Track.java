/**
 * Modern song
 * @author rengotap
 */
public class Track extends Song {
    private String title;
    private String album;
    private String firstName;
    private String lastName;
    private Genre genre;

    /**
     * Creates a new Track
     * @param title song name
     * @param album album name
     * @param firstName artist first name
     * @param lastName artist last name
     * @param genre song genre
     * @author rengotap
     */
    public Track(String title, String album, String firstName, String lastName, Genre genre) {
        this.title = title;
        this.album = album;
        this.firstName = firstName;
        this.lastName = lastName;
        this.genre = genre;
    }

    /**
     * @return song name
     */
    public String getTitle() {
        return title;
    }
    
    /**
     * @return album name
     */
    public String getAlbum() {
        return album;
    }

    /**
     * @return first name
     */
    public String getArtistFirstName() {
        return firstName;
    }

    /**
     * @return last name
     */
    public String getArtistLastName() {
        return lastName;
    }

    /**
     * @return song genre
     */
    public String getGenre() {
        String str = genre.name().toLowerCase();
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}
