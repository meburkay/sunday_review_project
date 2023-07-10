package week_07;

import java.util.Arrays;

public class Task1 {
    /*
     Task 1    : Write a program that accepts an array and prints an array with the elements "rotated left"
                // 0 1 2
        int[] x = {1,2,3};           // = > [2,3,1]
        int[] y = {17,12,10,8};      // = > [12,10,8,17]
        int[] a = {7,0,0};           // = > [0,0,7]
     */

    public static void main(String[] args) {
       //create an array
        int[] x = {1,2,3};

        /*

        int temp=x[0];
        x[0]=x[1]; x[0]=2
        x[1]=x[2];  x[1]=3
         .
         .
         .
         .




        x[2]=temp;

         */

        int temp=x[0];  //temp=1;

                     // 1  //   3    -1=2
        for (int i = 0; i < x.length-1; i++) {
            x[i]=x[i+1];
        }

        //last index  first value
        x[x.length-1]=temp;


        System.out.println(Arrays.toString(x));
    }

}
