package assignment1;
import java.util.ArrayList;

/**
 *  The interface that determines how a Listing is sorted
 */
public interface SortBehavior {
    /**
     * Abstract method for sorting
     */
    public ArrayList<String> sort(ArrayList<String> data);

}
