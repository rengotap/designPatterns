package assignment1;
import java.util.ArrayList;

/**
 * BubbleSort method for Listing
 * Modified from CSCE 146
 */
public class BubbleSort implements SortBehavior{

	/**
	 * Swaps neighboring elements quickly until the riht order is achieved
	 */ 
    public ArrayList<String> sort(ArrayList<String> data) 
    {
        boolean hasSwapped = true;
        while(hasSwapped) {
		    hasSwapped = false;
		    for (int i = 0; i < data.size() - 1; i++) {
                if (data.get(i).compareTo(data.get(i + 1)) > 0) {
				    String temp = data.get(i);
                    data.set(i, data.get(i + 1));
                    data.set(i + 1, temp);
				    hasSwapped = true;
			    }
		    }
	    }
        return data;
    }
}
