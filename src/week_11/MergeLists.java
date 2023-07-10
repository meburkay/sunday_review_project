package week_11;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeLists {
    public static void main(String[] args) {

        //we will create a method which will get two arraylist then we will put that arraylists in one then return it

        ArrayList<Integer> num1s=new ArrayList<>(Arrays.asList(1,2,3,4));
        ArrayList<Integer> num2s=new ArrayList<>(Arrays.asList(5,6,7,8));

        //12345678
     ArrayList<Integer> result=   mergeLists2(num1s,num2s);
        System.out.println(result);
    }

    private static ArrayList<Integer> mergeLists(ArrayList<Integer> num1s, ArrayList<Integer> num2s) {
       // ArrayList<Integer> result=new ArrayList<>(num1s);
        ArrayList<Integer> result=new ArrayList<>();
        result.addAll(num1s);
        result.addAll(num2s);
        return result;
    }

    private static ArrayList<Integer> mergeLists2(ArrayList<Integer> num1s, ArrayList<Integer> num2s) {
        // ArrayList<Integer> result=new ArrayList<>(num1s);
        ArrayList<Integer> result=new ArrayList<>();
        for (Integer num1 : num1s) {
            result.add(num1);
        }
        for (Integer num1 : num2s) {
            result.add(num1);
        }
        return result;
    }
}
