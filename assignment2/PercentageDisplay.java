package assignment2;
import java.text.DecimalFormat;
import java.util.*;

/**
 * Displays polling data as a percentage
 */
public class PercentageDisplay implements Observer{

    Subject poll = new StudentGovPoll("temp");
    HashMap<String, Integer> votes = new HashMap<String, Integer>();
    int numVotes = 0;

    /**
     * Creates a new PercentageDisplay
     * @param poll
     */
    PercentageDisplay(Subject poll) {
        this.poll = poll;
        poll.registerObserver(this);
    }

    /**
     * Updates polling data 
     */
    public void update(HashMap<String, Integer> votes) {
        this.votes = votes;
        Iterator temp = votes.entrySet().iterator();
        while(temp.hasNext()) {
            Map.Entry mapElement = (Map.Entry)temp.next();
            numVotes = numVotes + votes.get(mapElement.getKey());
        }
        display();
    }

    /**
     * Displays the current percentage values for each candidate
     */
    public void display() {
        System.out.println();
        System.out.println("Current Percent of Votes:");

        Iterator temp = votes.entrySet().iterator();
        while(temp.hasNext()) {
            Map.Entry mapElement = (Map.Entry)temp.next();
            final DecimalFormat df = new DecimalFormat("0.0");
            System.out.println(mapElement.getKey() + " : " + df.format((float)(votes.get(mapElement.getKey())*100) / numVotes) + "%");
        }
    }
}
