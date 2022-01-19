package assignment2;
import java.util.HashMap;

public class TallyDisplay implements Observer{

    Subject poll = new StudentGovPoll("temp");
    HashMap<String, Integer> votes = new HashMap<String, Integer>();

    TallyDisplay(Subject poll) {
        this.poll = poll;
    }

    public void update(HashMap<String, Integer> votes) {

    }

    public void display() {
        
    }
}
