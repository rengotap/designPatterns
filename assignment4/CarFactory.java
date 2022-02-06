/**
 * Car factory class
 */
public class CarFactory {
    
    /**
     * Creates a new car of type
     * @param type The size of the car
     * @param make Manufacturer 
     * @param model The car model
     * @return Created car
     */
    public static Car createCar(String type, String make, String model) {
        System.out.println("Creating a " + make + " " + model);
        Car created;
        switch(type) {
                    case "small":
                        created = new SmallCar(make, model);
                        break;
                    case "sedan":
                        created = new SedanCar(make, model);
                        break;
                    case "luxury":
                        created = new LuxuryCar(make, model);
                        break;
                    default:
                        created = new SmallCar("type", "error");  // this should never happen
        }
        created.assemble();
        return created;
    }
}
