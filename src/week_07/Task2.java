package week_07;

import java.util.Arrays;

public class Task2 {
    /*
    Task 2 :    Write a program that accepts string and prints multiple words in the string

        "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer"

        output : wooden spoons
                 trash can
                 dish washer
     */

    public static void main(String[] args) {


        String words= "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";
        String[] strings = words.split(", ");
        //for windows alt + ENTER
        //for mac     option + ENTER
         System.out.println(Arrays.toString(strings));

        //we need to get each element
        for (String each : strings) {

            //if the element contains space
            if (each.contains(" "))
                System.out.println(each);

            //print the words
        }

    }
}
