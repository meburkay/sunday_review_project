package week_08;

public class Task5 {
    /*
     Task 5
 : Write a method that given 2 int values, return true if either of them is in the range 10..20 include two of them.
            multiple parameter  --- takes two integers
            return type --- boolean

             in1020(12, 99) → true
             in1020(21, 12) → true
             in1020(8, 99) → false
     */

    public static void main(String[] args) {

     boolean result= in1020(8, 99);

        System.out.println("result = " + result);

    }

    public static boolean in1020(int number1, int number2) {
         // we are checking number1 between 10 and 20        number2 between 10 and 20
      /*  if ((number1>=10 && number1<=20)             || (number2>=10 && number2<=20)){
            return true;
        }else {
            return false;
        }

       */

        //interview

        return  ((number1>=10 && number1<=20)  || (number2>=10 && number2<=20));

    }
}
