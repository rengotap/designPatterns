import java.util.ArrayList;
import java.util.Arrays;

public class SpanishState implements State {

    private MusicBox box;

    /**
     * Constructor for spanishState
     * @param box MusicBox
     * @author rengotap
     */
    SpanishState(MusicBox box) {
        this.box = box;
    }

    /**
     * creates an array list with the lyrics to "twinkle twinkle little star" 
     * then calls the music box's playSong method (ES)
     * @author rengotap
     */
    public void pressStarButton() {
        ArrayList<String> lyrics = new ArrayList<String>(
            Arrays.asList("Estrellita, ¿dónde estás?", "Quiero verte cintilar",
                "En el cielo, sobre el mar", "Un diamante de verdad",
                "Estrellita, ¿dónde estás?", "Quiero verte cintilar"));
        box.playSong("Estrellita, ¿Dónde Estás?", lyrics);
    }

    /**
     * creates an array list with the lyrics to "If you're happy and you know it"
     * then calls the music box's playSong method (ES)
     * @author rengotap
     */
    public void pressHappyButton() {

    }

    /**
     * Changes the music box's state to English
     * @author rengotap
     */
    public void pressEnglishButton() {
        System.out.println("Switching to English");
        box.setState(box.getEnglishState());
    }

    /**
     * Changes the music box's state to Fr*nch
     * @author rengotap
     */
    public void pressFrenchButton() {
        System.out.println("Passe au français");
        box.setState(box.getFrenchState());
    }

     /**
     * Displays "You are already in Spanish mode"
     * @author rengotap
     */
    public void pressSpanishButton() {
        System.out.println("Ya estás en modo español");
    }
}
