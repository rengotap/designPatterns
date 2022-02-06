/**
 * A type of car
 */
public class SmallCar extends Car {

    /**
     * Makes a new Small Car
     * @param make manufacturer
     * @param model type
     */
    SmallCar(String make, String model) { 
        super(make, model);
    }   

    /**
     * Displays frame message
     */
    protected void addFrame() {
        System.out.println("Adding a small frame");

    }

    /**
     * Adds small car accessories
     */
    protected void addAccessories() {
        accessories.add(Accessories.FLOOR_MATS);
        accessories.add(Accessories.PHONE_CHARGER);
    }
}
