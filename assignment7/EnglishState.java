import java.util.ArrayList;
import java.util.Arrays;

public class EnglishState implements State {

    private MusicBox box;

    /**
     * Constructor for englishState
     * @param box MusicBox
     * @author rengotap
     */
    EnglishState(MusicBox box) {
        this.box = box;
    }

    /**
     * creates an array list with the lyrics to "twinkle twinkle little star" 
     * then calls the music box's playSong method (EN)
     * @author rengotap
     */
    public void pressStarButton() {
        ArrayList<String> lyrics = new ArrayList<String>(
            Arrays.asList("Twinkle twinkle little star", "How I wonder what you are",
                "Up above the world so high", "Like a dimond in the sky",
                "Twinkle twinkle little star", "How I wonder what you are"));
        box.playSong("Twinkle Twinkle Little Star", lyrics);
    }

    /**
     * creates an array list with the lyrics to "If you're happy and you know it"
     * then calls the music box's playSong method (EN)
     * @author rengotap
     */
    public void pressHappyButton() {
        ArrayList<String> lyrics = new ArrayList<String>(
            Arrays.asList("If you're happy and you know it clap your hands"));

        box.playSong("If You're Happy and You Know It", lyrics);

    }
    /**
     * Displays "You are already in English mode"
     * @author rengotap
     */
    public void pressEnglishButton() {
        System.out.println("You are already in English mode");
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
     * Changes the music box's state to Spanish
     * @author rengotap
     */
    public void pressSpanishButton() {
        System.out.println("Cambiando al español");
        box.setState(box.getSpanishState());
    }
}
