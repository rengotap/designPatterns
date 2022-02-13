import java.util.Iterator;

/**
 * Iterates through Exercises
 */
public class ExerciseIterator implements Iterator {
    
    private Exercise[] exercises;
    private int position = 0;  // default to zero

    /**
     * Creates a new ExerciseIterator
     * @param exercises list of exercises
     */
    public ExerciseIterator(Exercise[] exercises) {
        this.exercises = exercises;
    }

    /**
     * Checks if exercises has another free slot
     */
    public boolean hasNext() {
        if (position >= exercises.length || exercises[position] == null) {
            return false;
        } else {
            return true;
        } 
    }

    /**
     * Goes to next exercise and returns current
     */
    public Exercise next() {
        if(!hasNext()) {
            return null;
        } else {
            position = position + 1;
            return exercises[position];
        }
    }
}
