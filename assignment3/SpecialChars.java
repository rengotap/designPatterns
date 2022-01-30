import java.util.Random;

/**
 * Loops through the characters in the password, 30% of the time, adds a random special character after the letter.
 */
public class SpecialChars extends PasswordDecorator {
    
    /**
     * Creates a new SpecialChars object
     * @param passwordBeginning from previous
     */
    public SpecialChars(Password passwordBeginning) {
        super(passwordBeginning);
    }

    /**
     * returns a password with random charachters replaced
     */
    public String getPassword() {
        char [] temp = passwordBeginning.getPassword().toCharArray();
        char [] special = {'*', '!', '%', '+', '.', '{', '}'};
        String ret = passwordBeginning.getPassword();
        Random random = new Random();
        for (int i = 0; i < temp.length; i++) {
            int x = random.nextInt(100);
            if(x < 30 ) {
                ret = ret.substring(0, i) + special[random.nextInt(special.length)] + ret.substring(i);
            }
        }
        return ret;
    }
}
