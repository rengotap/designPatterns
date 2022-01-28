public abstract class PasswordDecorator {
    
    protected Password passwordBeginning;

    PasswordDecorator(Password passwordBeginning) {
        this.passwordBeginning = passwordBeginning;
    }
    public abstract String getPassword();
}
