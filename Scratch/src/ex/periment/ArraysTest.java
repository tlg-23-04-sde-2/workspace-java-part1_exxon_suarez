package ex.periment;

import java.util.Arrays;

class ArraysTest {
    public static void main(String[] args) {
        int[] ages = new int[4];                        // declare new array containing INT types with 4 indexes ( undefined )
        ages[0] = 56;           // assign a value to 0 index
        ages[1] = 49;           // same as above but for index 1
        ages[2] = 9;
        ages[3] = 9;

        System.out.println(Arrays.toString(ages));      // using toString method to print out array index values

        double[] temps = {64.0,56.9,83.4,49.0,98.6};    // declare new DOUBLE type array and enclose values or each index in the brackets
        for (double temp : temps) {                     // using the JAVA array foreach syntax to loop over our array ( cant use index with this method)
            System.out.println("The tempeture is:" + temp);
        }
        System.out.println("");


        for ( int i = 0; i < temps.length; i++) {       // using traditional foreach loop syntax to loop over array indexes ( have access to the index )
            System.out.println("The temperature is: "+ temps[i]);
        }

    }
}