/*
 * Business class (system class)
 */
class Television {
    // STATIC shared variables *****
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;

    private static int instanceCount = 0;  // instances declared counter
    // ****

    private String brand;
    private double volume;


    // instance variables or fields (aka properties or attributes)
//    String brand = "Magnavox"; // default value when client doesn't say
//    double volume = 25; // default value when client doesn't say


    // constructor methods



    public static int getInstanceCount() {
        return instanceCount;
    }

    public Television() {
        instanceCount++; // When new instance created then counter incremented by 1
    }

    public Television(String brand, double volume ) {
        this(); // inheriting the instanceCount variable from above method
        setBrand(brand);
        setVolume(volume);
    }


    //business methods or operations
    public void turnOn(){
        boolean isConnected = verifyInternetConnection();
        System.out.println("turning on your " + brand + " tv to volume " + volume + " connection status: " + isConnected);
    }

    public void turnOff() {
        System.out.println("Shutting down your " + brand + " tv goodbye...");
    }

    // accessor (get/set) methods - these provide "controlled access" to the objects fields


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    private boolean verifyInternetConnection () {
        return true;
    }

    public String toString() {
        return "Television: Brand = " + getBrand() + ", Volume = " + getVolume();
    }


}