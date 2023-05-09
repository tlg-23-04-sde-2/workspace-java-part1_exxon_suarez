package ex.periment;

import java.util.Locale;

/*
 *
 */
class PrimitivesTest {

    public static void main(String[] args) {
        int age = 33;
        System.out.println( "I am " + age);

        long population = 8_000_000_000L; // underscores are just for user readability
        System.out.println("The population is:" + population);

        double weight = 135.5;
        System.out.println("The weight is: " + weight);

        boolean hasTwins = false;
        System.out.println("I have twins: " + hasTwins);

        char shirtSize = 'L';

        System.out.println("The shirt size is:" + shirtSize);

        String name = "exxon";

        System.out.println("My name is: " + name);

        System.out.println("The word \"belly\" makes me laugh ");

        int i = 18;
        int j = i;
        i++; // increments i plus 1


        int x = 3;

        System.out.println("x is:" + x++);


    }
}