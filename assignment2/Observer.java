package assignment2;
import java.util.HashMap;

/**
 * Display interface
 */
public interface Observer {
    public void update(HashMap<String, Integer> votes);
}
