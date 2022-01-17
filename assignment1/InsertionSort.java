package assignment1;
import java.util.ArrayList;

public class InsertionSort implements SortBehavior {

    public ArrayList<String> sort(ArrayList<String> data) 
    {
        for (int i = 0; i < data.size(); ++i) 
        {
            int j = i;
            while (j > 0 && data.get(j - 1).compareTo(data.get(j)) > 0) 
            {
                String temp = data.get(j);
                data.set(j, data.get(j - 1));
                data.set(j - 1, temp);
                j = j - 1;
            }
        }
        return data;
    }
    
}
