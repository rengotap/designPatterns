/**
 * A type of car
 */
public class LuxuryCar extends Car{
    
    /**
     * Makes a new Luxury Car
     * @param make manufacturer
     * @param model type
     */
    public LuxuryCar(String make, String model) {
        super(make, model);
    }

    /**
     * Displays frame message
     */
    protected void addFrame() {
        System.out.println("Adding a beautiful frame");
    }

    /**
     * Displays special engine message
     */
    @Override
    protected void addEngine() {
        System.out.println("Adding Supped Up Engine");
    }

    /**
     * Adds luxury accessories
     */
    protected void addAccessories() {
        accessories.add(Accessories.FLOOR_MATS);
        accessories.add(Accessories.PHONE_CHARGER);
        accessories.add(Accessories.BACKUP_CAMERA);
        accessories.add(Accessories.EXTRA_CUP_HOLDERS);
        accessories.add(Accessories.HEATED_SEATS);
        accessories.add(Accessories.SPORTS_SEATS);
        accessories.add(Accessories.WINDOW_TINT);
        accessories.add(Accessories.HIGH_END_SOUND);
        accessories.add(Accessories.TRUNK_ORGANIZER);
        accessories.add(Accessories.BLUE_TOOTH);
        
    }
}
