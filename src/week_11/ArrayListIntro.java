package week_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListIntro {

    public static void main(String[] args) {

        ArrayList<Integer> nums=new ArrayList<>();

        //add element
        nums.add(2);
        System.out.println(nums);

        nums.add(3);
        System.out.println(nums);

        nums.add(3);
        System.out.println(nums);

        //add element in specific index
        nums.add(0,5);
        System.out.println(nums);

        //how to learn size of arraylist
        System.out.println(nums.size());
         //0  1  2  3
        //[5, 2, 3, 3]
        //how to remove element
     //  nums.remove(2); //it wil remove the element in index of 2
        //nums.remove(Integer.valueOf(2)); // it will remove 2 as an object directly
        nums.remove((Integer)2);// it will remove 2 as an Integer directly
        System.out.println(nums+"lkjsldf");

        //how to get element
        System.out.println(nums.get(0));

        //how to update your element
        nums.set(0,6);
        System.out.println(nums);

        //how tyo get the index of object
        System.out.println(nums.indexOf(3)); //it will return 1

        //how to get the element index from end
        System.out.println(nums.lastIndexOf(3)); //it will return 2

        //how to learn element in my arraylist or not

        System.out.println(nums.contains(5)); //false
        System.out.println(nums.contains(6)); //true

        //how to compare two arraylist
        ArrayList<Integer> num1s=new ArrayList<>(Arrays.asList(1,2,3));
        ArrayList<Integer> num2s=new ArrayList<>(Arrays.asList(3,1,2));

        System.out.println(num1s.equals(num2s));

        Collections.sort(num1s);
        Collections.sort(num2s);
        System.out.println(num1s.equals(num2s));

    }
}
