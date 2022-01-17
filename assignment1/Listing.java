package assignment1;
import java.util.ArrayList;

/**
 * Stores and sorts a list of Strings
 */
public class Listing {
    private String title;
    ArrayList<String> items = new ArrayList<String>();
    SortBehavior sortBehavior = new BubbleSort();

    /**
     * Creates a new Listing
     */
    Listing(String title) {
        this.title = title;
    }

    /**
     * Adds an item to items
     */
    public void add(String item) {
        items.add(item);
    }

    /**
     * Removes an item from items
     */
    public void remove(String item) {
        for (int i = 0; i < items.size(); i++) {
            if(items.get(i).equals(item))
                items.remove(i);
        }
    }

    /**
     * Returns title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Changes the sortBehavior between BubbleSort and InsertionSort
     */
    public void setSortBehavior(SortBehavior sortBehavior) {
        if (sortBehavior instanceof InsertionSort) {
            this.sortBehavior = new InsertionSort();
        } else if (sortBehavior instanceof BubbleSort) {
            this.sortBehavior = new BubbleSort();
        }
    }

    /**
     * Returns a sorted ArrayList
     */
    public ArrayList<String> getSortedList() {
        return sortBehavior.sort(items);
    }

    /**
     * Returns an unsorted ArrayList
     */
    public ArrayList<String> getUnSortedList() {
        return items;
    }
}
