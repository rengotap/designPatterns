package assignment2;
import java.util.HashMap;

public class PercentageDisplay implements Observer{

    Subject poll = new StudentGovPoll("temp");
    HashMap<String, Integer> votes = new HashMap<String, Integer>();
    int numVotes;

    PercentageDisplay(Subject poll) {
        this.poll = poll;
    }

    public void update(HashMap<String, Integer> votes) {

    }
}
