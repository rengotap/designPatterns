import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 * Plays music
 * @author rengotap
 */
public class MusicBox {

    private State englishState;
    private State frenchState;
    private State spanishState;
    private State state;

    /**
     * Creates a new music box & sets the state variables
     * @author rengotap
     */
    public MusicBox() {
        englishState = new EnglishState(this);
        frenchState = new FrenchState(this);
        spanishState = new SpanishState(this);
        state = englishState;  // Default to english
    }

    /**
     * Presses the star button on state variable
     * @author rengotap
     */
    public void pressStarButton() {
        state.pressStarButton();
    }

    /**
     * Presses the happy button on state variable
     * @author rengotap
     */
    public void pressHappyButton() {
        state.pressHappyButton();
    }

    /**
     * Presses the English button on state variable
     * @author rengotap
     */
    public void pressEnglishButton() {
        state.pressEnglishButton();
    }

    /**
     * Presses the French button on state variable
     * @author rengotap
     */
    public void pressFrenchButton() {
        state.pressFrenchButton();
    }

    /**
     * Presses the Spanish button on state variable
     * @author rengotap
     */
    public void pressSpanishButton() {
        state.pressSpanishButton();
    }

    /**
     * Changes the state
     * @param state new state
     * @rengotap
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * Returns the English state
     * @return English state
     * @author rengotap
     */
    public State getEnglishState() {
        return englishState;
    }

    /**
     * Returns the Fr*nch state
     * @return French state
     * @author rengotap
     */
    public State getFrenchState() {
        return frenchState;
    }

    /**
     * Returns the Spanish state
     * @return Spanish state
     * @author rengotap
     */
    public State getSpanishState() {
        return spanishState;
    }
    
    /**
     * Slowly displays lyrics from song's array list
     * @param songName name of song
     * @param lyrics lyrics
     * @author rengotap
     */
    public void playSong(String songName, ArrayList<String> lyrics) {
        System.out.println('\n' + "Now Playing: " + songName);
        for(int i = 0; i < lyrics.size(); i++) {
            System.out.println(lyrics.get(i));
            try {
                TimeUnit.MILLISECONDS.sleep(750);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println();
    }
}
