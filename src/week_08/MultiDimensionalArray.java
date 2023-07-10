package week_08;

import java.util.Arrays;

public class MultiDimensionalArray {

    public static void main(String[] args) {

        //two dimension
        int[][] array2D={
              // 0 1 2
                {1,2,3}, //0 //row
                {4,5,6}, //1
              // 0 1 2 3
                {7,8,9,10} //2
        };

        //print array

        System.out.println(Arrays.deepToString(array2D));


        //print 5
        System.out.println(array2D[1][1]);

        //print 10
        System.out.println(array2D[2][3]);

        //three dimension
        int[][][] array3D={
                {
                        {1,2,3} ,  //one dimensional
                        {4,5,6}
                } , //first 2 dimensional array
                {
                        {7,8,9}
                }   // second 2 dimensional array
        } ;  //3 dimensional array

        int[][] array={
                //columns
                // 0 1 2
                {1,2,3}, //0 //row
                {4,5,6}, //1
                // 0 1 2 3
                {7,8,9,10} //2
        };
        //loop with 2 dimensional array

        for (int i = 0; i < array.length; i++) {  //rows or we can say each one dimensional arrays
            System.out.println("started with "+( i+1) +" array");
            for (int j = 0; j <array[i].length ; j++) { //for elements or columns

                System.out.println(array[i][j]);
            }
            System.out.println("finished"+ (i+1) +" array");
        }

    }
}
