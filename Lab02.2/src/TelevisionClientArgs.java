/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

/**
 * Intended usage (by human):
 *  $ java TelevisionClientArgs <brand> <volume> <display>
 * 
 * Example:
 *  $ java TelevisionClientArgs Samsung 32 PLASMA
 *
 * GOAL:
 *  Create an instance of Television with the specifications (values) provided by the user.
 */
class TelevisionClientArgs {

    public static void main(String[] args) {
        // must first check for the presence of your (required) 3 arguments
        if (args.length < 3) {
//            DisplayType[] allDisplays = DisplayType.values();
            String usage = "Usage: java TelevisionClientArgs <brand> <volume> <display>";
            String example = "Example: java TelevisionClientArgs Samsung 32 PLASMA";
            String note1 = "Note: supported displays are "+ Arrays.toString(DisplayType.values());  // we use the Arrays class to use its array to string method to convert our DisplayType values to a string
            String note2 = "Supported brands are" + Arrays.toString(Television.VALID_BRANDS);
            System.out.println(usage);
            System.out.println(example);
            System.out.println(note1);
            System.out.println(note2);
            return;  // early return from main(), application exits , we use this early return in place of an else statement
        }

    /*
     * final part of our whiteboard example below
     */
        // at this point, you can safely proceed, because you got your arguments
        // first, let's just show that we got them

        // STEP 1: converts arguments into proper types
        String brand = args[0];
        int volume = Integer.parseInt(args[1]);  // taking the string at slot 1 and returns an integer
        DisplayType display = DisplayType.valueOf(args[2].toUpperCase());    // converting our DisplayType string we received and using valueOf() method to return the actual DisplayType

        // STEP 2; create a Television object from these ingredients
        Television tv = new Television(brand, volume, display);
        // STEP 3: print it and congratulate
        System.out.println("Congrats on the order hopefully it arrives in one piece ");
        System.out.println(tv);
    }
}