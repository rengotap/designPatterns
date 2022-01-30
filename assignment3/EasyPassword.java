import java.util.Random;

/**
 * Removes White Space and adds a random number between 0-100 to the end
 */
public class EasyPassword extends Password{
    
    /**
     * Creates a new EasyPassword
     * @param phrase password base
     */
    EasyPassword(String phrase) {
        this.password = phrase;
    }

    /**
     * Returns a new EasyPassword
     */
    public String getPassword() {
        Random random = new Random();
        return password.replaceAll("\\s+", "")+(random.nextInt(100));
    }
}
