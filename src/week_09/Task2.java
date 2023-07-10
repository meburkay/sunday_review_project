package week_09;

import java.util.Arrays;

public class Task2 {
    /*
    Task 2 : Four or less


					Given an Array of Strings, go through and read only Strings that are 4 characters or less.

					Take those Strings and put them into a different Array

					Ex:

					Input:
					"apples", "tree", "loop", "cat", "animal", "shortcut"

					Output:
					[ tree, loop, cat ]
     */

    public static void main(String[] args) {

String[] array={"apples", "tree", "loop", "cat", "animal", "shortcut"};

String [] res=getWords(array,4);


        System.out.println(Arrays.toString(res));

    }

    private static String[] getWords(String[] array, int numberOfLetter) {
        int counter=0;

        for (String s : array) {
            if (s.length()<=numberOfLetter)
                counter++;
        }

        System.out.println(counter);
        String [] result=new String[counter];

        int index=0;
        for (String s : array) {
            if (s.length()<=numberOfLetter)
               result[index++]=s;
        }


    return  result;

    }
}
