package com.mathhelp;
import static com.mathhelp.Calculator.*; // importing our methods from the calculator class (so we dont have to prepend our methods with "Calculator")

class CalculatorClient {
    public static void main(String[] args) {

        // assigning the sum of our add method called on calc1 into sum variable
        // holding on to the sum variable so we can reuse it
        double sum = Calculator.add(3.1,5.1);
        System.out.println("The answer is for addition is  " + sum);

        // inline method call below for our subtract method on calc1
        // inlining used when we don't need to reuse the output of rthe method
        System.out.println("The difference is: " + subtract(3.1,5.1));

        System.out.println("10 is even: " + Calculator.isEven(10));

        System.out.println();

        System.out.println(Calculator.getRandomInt());

        System.out.println("********");
        System.out.println(Calculator.getRandomInt(5, 20));

        System.out.println(Calculator.getAverage(3,5,9,9));
        System.out.println(Calculator.getAverage(56));

    }
}