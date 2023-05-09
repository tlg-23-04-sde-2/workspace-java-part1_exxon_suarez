package com.mathhelp;

/*
 * This is an "all-static" class i.e., one that contains only static methods
 */
class Calculator {
    // add, subtract, isEven

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }


    public static boolean isEven(int value) {
        return value % 2 == 0;
    }



    /*
     * Returns random integer between 1 and 14.
     * HINT: see a class called Math (in package java.lang) look for helpful method to get started
     * NOTE: these methods in the MAth class are all "static"
     * which means you call them as Math.methodName()
     */
    public static int getRandomInt() {
        int result = 0;     // declare return value as local variable
        double rand = Math.random();  // this is 0.00000 to 0.99999
        double scaled = (rand * 14) + 1;   // 0.00000 to 13.99999
        double scaledFloor = Math.floor(scaled) + 1; // 1.0000 to 14.99999

        // convert (via explicit downcast) the double to int
        result = (int) scaled;     // 1 to 14 because int type doesn't accept decimals

        return result;
    }

    public static int getRandomInt(int min, int max) {
        double rand = Math.random();   /// 0.000 to 0.9999
        double scaled = rand * (max - min) + min; // 5.000 to 19.985
        double rounded = Math.ceil(scaled); // 5.000 to 20.000
        return (int) rounded;

        // double result = (Math.random()*(max-min))+min;
        // (0.0000 to 0.9999 multiplies by (20 - 5)) plus 5
        //(this gives us a number between our min and max)
        // return (int) result; // return result as int to remove decimal (downcast)
    }

    /*
     * returns the average of the supplied integers
     * getAverage()
     * aveInt()
     *
     */

    public static double getAverage(int first, int... rest) {    // client can pass multiple values of ints ( ex: 3,5,9,9 ). pass int first as first parameter so that client HAS to pass atleast 1 parameter
        double result = 0.0;
        double sum = first;
        for( int value : rest) {
            sum += value;          // same as sum = sum + rest    // add the current iteration value to sum and assign to sum
        }
        result = sum/(1+ rest.length);                                // at runtime, rest is an array

        return result;

    }
}