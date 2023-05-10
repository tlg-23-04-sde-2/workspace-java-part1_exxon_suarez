package com.entertainment;

/*
 * Business class (system class)
 */

import java.util.Arrays;

public class Television {
    // STATIC shared variables *****
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    public static String[] VALID_BRANDS = {"Samsung","LG","Toshiba", "Sony"};

    private static int instanceCount = 0;  // instances declared counter
    // ****

    private String brand;
    private double volume;
    private DisplayType display = DisplayType.LED;  // otherwise null if client doesnt say

    private double oldVolume;
    private boolean isMuted;



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

    public Television(String brand, double volume ) throws InvalidVolumeException {
        this(); // inheriting the instanceCount variable from above method
        setBrand(brand);
        setVolume(volume);
    }

    // 3 arg constructor including the Display enum
    public Television(String brand, double volume, DisplayType display) throws  InvalidVolumeException {
        this(brand, volume);
        this.display = display;
    }


    //business methods or operations
    public void turnOn(){
        boolean isConnected = verifyInternetConnection();
        System.out.println("turning on your " + brand + " tv to volume " + volume + " connection status: " + isConnected);
    }

    public void turnOff() {
        System.out.println("Shutting down your " + brand + " tv goodbye...");
    }

    public void mute() {
        if (!isMuted()) {       // not currently muted
            oldVolume = getVolume();
            volume = 0;
            isMuted = true;

        }else {                 // currently muted
            volume = oldVolume;
            isMuted = false;
        }
    }

    // accessor (get/set) methods - these provide "controlled access" to the objects fields


    public String getBrand() {
        return brand;
    }
    // syntax to loop over an array
    // for(String validBrand : VALID_BRANDS) {
    // check incoming 'brand' against VALID_BRAND using the equals method
    // }

    // VALID_BRANDS looks like this {"Samsung","LG","Toshiba", "Sony"}
    public void setBrand(String brand) {
        if (brand.equals("Samsung")) {
            this.brand = brand;
        }
        else if (brand.equals("LG")) {
            this.brand = brand;
        }
        else if (brand.equals("Toshiba")) {
            this.brand = brand;
        } else {
//            System.out.println(" This is an invalid brand type please choose either Toshiba, Samsung, or LG");
            System.out.printf(" This is an invalid brand %s type. Please choose one of the following: %s \n", brand, Arrays.toString(VALID_BRANDS));
        }

    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) throws InvalidVolumeException  {

        if (volume >= MIN_VOLUME && volume <= MAX_VOLUME ) {
            this.volume = volume;

            isMuted = false;            // setting the volume also unmutes the tv
        }else {

//            System.out.println(" The provided Volume is not between 0 and 100 please submit new volume");
            throw new InvalidVolumeException("Invalid Volume:" + volume + "." +   "Valid range is: " +  MIN_VOLUME + " - " + MAX_VOLUME );
        }
    }

    private boolean verifyInternetConnection () {
        return true;
    }

    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }

    public boolean isMuted() {
        return isMuted;
    }



//    public String toString() {
//        return "Television: Brand = " + getBrand() + ", Volume = " + getVolume();
//    }


    // This toString doesnt print it returns so that the client side java class can call it and print the toString
    public String toString() {
        String volumeString = isMuted() ? "<muted>" : String.valueOf(getVolume());
        // here we are returning a formatted String
        // we cant use sout or souf because this toString doesnt print it RETURNS!!!!
        return String.format("Television: brand=%s, volume=%s, display=%s", getBrand(), volumeString, getDisplay());
//        return "Television: brand:= " + getBrand() + ", volume= " + volumeString + " Display: " + getDisplay();
    }


}