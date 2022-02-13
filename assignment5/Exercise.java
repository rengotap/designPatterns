import java.util.ArrayList;

/**
 * Exercise Class
 */
public class Exercise {
    
    private String title;
    private ArrayList<String> targetMuscles = new ArrayList<String>();
    private ArrayList<String> directions = new ArrayList<String>();;

    /**
     * Creates a new Exercise
     * @param title exercise name
     */
    public Exercise(String title) {
        this.title  = title;
    }

    /**
     * Creates a new Exercise
     * @param title exercise name
     * @param targetMuscles worked muscles
     * @param directions how to do it
     */
    public Exercise(String title, ArrayList<String> targetMuscles, ArrayList<String> directions) {
        this.title = title;
        this.targetMuscles = targetMuscles;
        this.directions = directions;
    }

    /**
     * Adds a new muscle
     * @param muscle name of muscle
     */
    public void addTargetMuscle(String muscle) {
        targetMuscles.add(muscle);
    }

    /**
     * Removes a muscle
     * @param muscle name of muscle
     */
    public void removeTargetMuscle(String muscle) {
        targetMuscles.remove(muscle);
    }

    /**
     * Standard toString Method
     */
    public String toString() {
        String temp;
        temp = '\n' + "... "+ title + " ..." + '\n'+ "Muscles: ";
        for (int i = 0; i < targetMuscles.size(); i++) {
            temp = temp + targetMuscles.get(i) + ", ";
        }
        temp = temp + '\n';
        for (int i = 0; i < directions.size(); i++) {
            temp = temp + "- " + directions.get(i) + '\n';
        }
        return temp;
    }
}
