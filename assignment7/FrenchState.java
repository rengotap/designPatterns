import java.util.ArrayList;
import java.util.Arrays;

public class FrenchState implements State {

    private MusicBox box;

    /**
     * Constructor for frenchState
     * @param box MusicBox
     * @author rengotap
     */
    FrenchState(MusicBox box) {
        this.box = box;
    }

    /**
     * creates an array list with the lyrics to "twinkle twinkle little star" 
     * then calls the music box's playSong method (FR)
     * @author rengotap
     */
    public void pressStarButton() {

    }

    /**
     * creates an array list with the lyrics to "If you're happy and you know it"
     * then calls the music box's playSong method (FR)
     * @author rengotap
     */
    public void pressHappyButton() {
        ArrayList<String> lyrics = new ArrayList<String>(
            Arrays.asList("Si tu as d' la joie au coeur, Frappe des mains",
                "Si tu as d' la joie au coeur, Frappe des mains",
                "Si tu as d' la joie au coeur, Frappe des mains",
                "Si tu as d' la joie au coeur, Frappe des mains"));
        box.playSong("Si Tu as D' la Joie au Coeur", lyrics);
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
     * Displays "You are already in French mode"
     * @author rengotap
     */
    public void pressFrenchButton() {
        System.out.println("Vous êtes déjà en mode français");
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
