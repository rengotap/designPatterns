/**
 * Add symbols to the password based on a set conversion.
 */
public class Symbols extends PasswordDecorator {
    
    /**
     * Creates a new Symbols object
     * @param passwordBeginning previous input
     */
    public Symbols(Password passwordBeginning) {
        super(passwordBeginning);
    }

    /**
     * Returns an edited password
     */
    public String getPassword() {
        String temp = passwordBeginning.getPassword();
        if(temp.contains("a"))
            temp = temp.replaceAll("a", "@");
        if(temp.contains("e"))
            temp = temp.replaceAll("e", "3");
        if(temp.contains("g"))
            temp = temp.replaceAll("g", "9");
        if(temp.contains("i"))
            temp = temp.replaceAll("i", "!");
        if(temp.contains("o"))
            temp = temp.replaceAll("o", "0");
        if(temp.contains("s"))
            temp = temp.replaceAll("s", "\\$");
        if(temp.contains("t"))
            temp = temp.replaceAll("t", "7");
        return temp;
    }
}
