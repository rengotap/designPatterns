import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.text.Position;

/**
 * PT base class
 */
public class PT {
    
    private String firstName;
    private String lastName;
    private String bio;
    private Exercise[] exercises;
    int temp = 0; // Everything else works i just can't get the itterator right

    /**
     * creates a new object of PT
     * @param firstName First Name
     * @param lastName Last Name
     * @param bio User Bio
     */
    public PT(String firstName, String lastName, String bio) {
        exercises = new Exercise[3];
        this.firstName = firstName;
        this.lastName = lastName;
        this.bio = bio;
    }   

    /**
     * Adds an exercise
     * @param title Name
     * @param muscleGroups Muscles
     * @param directions How to do it
     */
    public void addExercise(String title, ArrayList<String> muscleGroups,
        ArrayList<String> directions) {

        // Start Test Code
        Exercise toAdd = new Exercise(title, muscleGroups, directions);
        exercises[temp] = toAdd;
        temp = temp+1;
        // End Test Code
        
        ExerciseIterator it = createIterator();
        if(it.hasNext()) {
            it.next();
        } else {
            growArray(exercises);
            it.next();
        }
    }
    /**
     * Returns firstName
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }
    /**
     * Returns lastName
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * returns Bio
     * @return bio
     */
    public String getBio() {
        return bio;
    }

    /**
     * Makes the array 2x bigger
     * @param exercises array to grow
     * @return bigger array
     */
    private Exercise[] growArray(Exercise[] exercises) {
        Exercise[] ret = new Exercise[exercises.length*2];
        for(int i = 0; i < ret.length; i++) {
            ret[i] = exercises[i]; 
        }
        //System.arraycopy(exercises, 0, ret, 0, exercises.length);  // very cool method
        return ret;
    }

    /**
     * Creates a new iterator
     * @return the created iterator
     */
    public ExerciseIterator createIterator() {
        //ExerciseIterator ret = new ExerciseIterator(exercises);
        return new ExerciseIterator(exercises);
    }

    /**
     * Standard To String Method
     */
    public String toString() {
        String temp = firstName + " " + lastName;
        temp = temp + '\n' + bio + '\n';
        return temp;
    }
}
