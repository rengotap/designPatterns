import java.util.Random;
/**
 * For each character in the password, 50% of the time it will be in upper case, and the other 50% it will be in lower.
 */
public class RandomCasing extends PasswordDecorator {
    
    /**
     * Creates a new random casing
     * @param passwordBeginning password to edit
     */
    public RandomCasing(Password passwordBeginning) {
        super(passwordBeginning);
    }

    /**
     * Returns passWordBeginning in random casing
     */
    public String getPassword() {
        char [] temp = passwordBeginning.getPassword().toCharArray();
        Random random = new Random();
        for (int i = 0; i < temp.length; i++) {
            if(random.nextBoolean()) {
                try {
                    char c = temp[i];
                    if (Character.isUpperCase(c))
                    {
                        temp[i] = Character.toLowerCase(c);
                    }
                    else if (Character.isLowerCase(c))
                    {
                        temp[i] = Character.toUpperCase(c);
                    }
                }
                catch(Exception e) {

                }
            }
        }
        return new String(temp);
    }
}
