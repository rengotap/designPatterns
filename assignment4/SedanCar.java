/**
 * A type of car
 */
public class SedanCar extends Car{
    
    /**
     * Makes a new Sedan
     * @param make manufacturer
     * @param model type
     */
    public SedanCar(String make, String model) {
        super(make, model);
    }

    /**
     * Displays frame message
     */
    protected void addFrame() {
        System.out.println("Adding a three part frame");
    }

    /**
     * Adds sedan accessories
     */
    protected void addAccessories() {
        accessories.add(Accessories.FLOOR_MATS);
        accessories.add(Accessories.PHONE_CHARGER);
        accessories.add(Accessories.BACKUP_CAMERA);
        accessories.add(Accessories.EXTRA_CUP_HOLDERS);
        accessories.add(Accessories.HEATED_SEATS);
    }
}
