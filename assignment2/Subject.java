package assignment2;

/**
 * Polling interface
 */
public interface Subject {

    /**
     * Adds an observer to the array list
     * @param observer
     */
    public void registerObserver(Observer observer);

    /**
     * Removes an observer from the array list
     * @param observer
     */
    public void removeObserver(Observer observer);

    /**
     * Updates all observers in the array list
     */
    public void notifyObservers();
}
