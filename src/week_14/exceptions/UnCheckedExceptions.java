package week_14.exceptions;

import week_12.inheritance.appTask.Discord;

import java.util.Scanner;

public class UnCheckedExceptions {
public  static Discord discord;
    public static void main(String[] args) {
      //Arithmetic
        try {
            for (int i = 10; i >=0 ; i--) {
                System.out.println(1200/i);
            }
        } catch (Exception e) {

        }
        System.out.println("Divide With Zer Handled");

        //NullPointerException
       // discord.chat("Adam");

        String number="123a";
        //NumberFormatException
      //  System.out.println(Integer.parseInt(number));

        String responseTime="0.42 seconds";

        System.out.println(Double.parseDouble(responseTime.substring(0, 5)));

        String name="Elif";

        //StringIndexOutOfBoundsException
       // System.out.println(name.charAt(4));

        int[] nums={1,2,3,4,5};
        Scanner scanner=new Scanner(System.in);
        int userNumber= scanner.nextInt();
        // we can easily put conditions
        if (userNumber> nums.length+1){

        }

        //ArrayIndexOutOfBoundsException
      //  System.out.println(nums[5]);

    }
}
