package assignment2;
import java.util.*;

/**
 * Displays raw polling data
 */
public class TallyDisplay implements Observer{

    Subject poll = new StudentGovPoll("temp");
    HashMap<String, Integer> votes = new HashMap<String, Integer>();

    /**
     * creates a new tally display
     */
    TallyDisplay(Subject poll) {
        this.poll = poll;
        poll.registerObserver(this);
    }

    public void update(HashMap<String, Integer> votes) {
        this.votes = votes;
        display();

    }
    /**
     * Displays the current tally values for each candidate
     */
    public void display() {
        System.out.println();
        System.out.println("Current Tallies:");

        // adapted from geeksforgeeks
        Iterator temp = votes.entrySet().iterator();
        while(temp.hasNext()) {
            Map.Entry mapElement = (Map.Entry)temp.next();
            System.out.println(mapElement.getKey() + " : " + votes.get(mapElement.getKey()));
        }
    }
}
