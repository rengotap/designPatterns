package assignment1;
import java.util.ArrayList;

public class Listing {
    private String title;
    ArrayList<String> items = new ArrayList<String>();
    SortBehavior sortBehavior = new BubbleSort();

    Listing(String title) {
        this.title = title;
    }

    public void add(String item) 
    {
        items.add(item);
    }

    public void remove(String item)  // TODO: find and remove
    {
        //items.remove(0);
    }

    public String getTitle()
    {
        return this.title;
    }

    public void setSortBehavior(SortBehavior sortBehavior) 
    {
        this.sortBehavior = new InsertionSort();
    }

    public ArrayList<String> getSortedList() 
    {
        
        return sortBehavior.sort(items);
    }

    public ArrayList<String> getUnSortedList() 
    {
        return items;
    }
}
