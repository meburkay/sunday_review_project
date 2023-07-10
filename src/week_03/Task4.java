package week_03;

public class Task4 {
    public static void main(String[] args) {

        double fahrenheit = 212;

        System.out.println(fahrenheit + "degree Fahrenheit is equal to " + ((5*(fahrenheit-32))/9) + " in Celsius");

        //get the value inside the variable
        double fah=212;

        //write the formula and calculate
        double cel=(5*(fah-32))/9;

        //  System.out.println(30.0/5);

        //and print the result

        System.out.println(cel);

    }
}
/*
- Write a Java program to convert temperature from Fahrenheit to Celsius degree
        - Input a degree in Fahrenheit: 212

                            Formula :         C = (5(F-32))/9

        - Expected Output:
                            212.0 degree Fahrenheit is equal to 100.0 in Celsius
 */