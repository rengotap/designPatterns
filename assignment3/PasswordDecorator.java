/**
 * Abstract base class for all the fancy passwords
 */
public abstract class PasswordDecorator extends Password {
    
    /**
     * The original input
     */
    protected Password passwordBeginning;

    /**
     * Creates a new Password Decorator
     * @param passwordBeginning takes in user input
     */
    PasswordDecorator(Password passwordBeginning) {
        this.passwordBeginning = passwordBeginning;
    }

    /**
     * Simple method for get password
     */
    public String getPassword() {
        return password;
    }
}
