import java.util.ArrayList;
import java.util.Arrays;

/**
 * French Language State
 * @author rengotap
 */
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
        ArrayList<String> lyrics = new ArrayList<String>(
            Arrays.asList("Brille, brille, petite étoile", "Je me demande vraiment ce que tu es!",
                "Au-dessus du monde si haut", "Comme un diamant dans le ciel",
                "Brille, brille, petite étoile", "Je me demande vraiment ce que tu es!"));
        box.playSong("Brille Brille Petite Étoile", lyrics);
    }

    /**
     * creates an array list with the lyrics to "If you're happy and you know it"
     * then calls the music box's playSong method (FR)
     * @author rengotap
     */
    public void pressHappyButton() {
        ArrayList<String> lyrics = new ArrayList<String>(
            Arrays.asList("Si tu as d' la joie au cœur, Frappe des mains",
                "Si tu as d' la joie au cœur, Frappe des mains",
                "Si tu as d' la joie au cœur, Frappe des mains",
                "Si tu as d' la joie au cœur, Frappe des mains"));
        box.playSong("Si Tu As D' La Joie Au Cœur", lyrics);
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
