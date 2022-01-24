package assignment2;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Runs student government polls
 * (possibly the academic deep state)
 */
public class StudentGovPoll implements Subject{
    private ArrayList<Observer> observers;
    HashMap<String, Integer> votes = new HashMap<String, Integer>();
    String school;
    int numUpdates;

    /**
     * Creates a new StudentGovPoll
     */
    StudentGovPoll(String school) {
        this.school = school;
        observers = new ArrayList<Observer>();
    }

    /**
     * Adds an observer
     */
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Removes an observer
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Updates all observers
     */
    public void notifyObservers() {
        for(int i = 0; i < observers.size(); i++) {
            observers.get(i).update(votes);
        }
    }

    /**
     * Adds a new candidate
     * @param president
     */
    public void addCandidate(String president) {
        votes.put(president, 0);
    }

    /**
     * Adds votes to the specified candidate
     * @param president
     * @param num
     */
    public void enterVotes(String president, int num) {
        votes.put(president, votes.get(president)+num);
        numUpdates = numUpdates+1;
        if(numUpdates == 4) {
            notifyObservers();
        }
    }

    /**
     * returns school
     * @return the name of school
     */
    public String getSchool() {
        return school;
    }
}
