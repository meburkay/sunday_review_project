package week_08;

public class Task1 {

    /*
    
    Task 1 :   Write a method that can check if a number is even or odd
     */
    public static void main(String[] args) {

        // we will create a method then we will provide a number then it will return even or odd

        String result = checkNumberEvenOrOdd(3);
        System.out.println(result);


    }

    private static String checkNumberEvenOrOdd(int number) {
        return(number % 2 == 0) ? "Even" : "Odd"; //my prefer
    /*    if (number%2==0){  //even
            return  "Even";
        }else {
            return  "Odd";
        }

     */

/*
        String result="";
        if (number%2==0){
            result="Even";
        }else {
            result="Odd";
        }
        return  result;
*/









    }


}
