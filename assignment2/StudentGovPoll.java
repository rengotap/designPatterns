package assignment2;
import java.util.ArrayList;
import java.util.HashMap;

public class StudentGovPoll {
    ArrayList<Observer> observers = new ArrayList<Observer>();
    HashMap<String, Integer> votes = new HashMap<String, Integer>();
    String school;
    int numUpdates;

    /**
     * Creates a new StudentGovPoll
     */
    StudentGovPoll(String school) {
        this.school = school;
    }

    public void registerObserver(Observer observer) {

    }

    public void removeObserver(Observer observer) {

    }

    public void notifyObservers() {

    }

    public void addCandidate(String president) {

    }

    public void enterVotes(String president, int num) {

    }

    public String getSchool() {
        return school;
    }
}
