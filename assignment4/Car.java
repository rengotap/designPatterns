import java.util.ArrayList;

/**
 * Abstract class for car
 */
public abstract class Car {

    private String make;    
    private String model;
    protected ArrayList<Accessories> accessories = new ArrayList<Accessories>();

    /**
     * Makes a car
     * @param make the car brand
     * @param model the car model
     */
    public Car(String make, String model) {  // This feels like it should be abstract
        make = this.make;
        model = this.model;
    }
    
    /**
     * Assembles a car
     */
    public void assemble() {
        addFrame();
        addWheels();
        addEngine();
        addWindows();
        addAccessories();
        displayAccessories();
    }

    /**
     * Abstract frame method
     */
    protected abstract void addFrame();

    /**
     * Prints wheels message
     */
    protected void addWheels() {
        System.out.println("Adding the Wheels");
    }

    /**
     * Prints default engine message
     */
    protected void addEngine() {
        System.out.println("Adding a Standard Engine");
    }

    /**
     * Prints window message
     */
    protected void addWindows() {
        System.out.println("Adding Windows");
    }

    /**
     * Abstract accessory method
     */
    protected abstract void addAccessories();

    /**
     * Prints all the car's accessories
     */
    protected void displayAccessories() {
        System.out.println("Accessories:");
        for (int i = 0; i < accessories.size(); i++) {
            System.out.println(accessories.get(i));
        }
    }
}
