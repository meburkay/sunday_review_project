package week_15.collections;

import java.util.*;

public class Task1 {
    /*
    Task 1

 List<Integer> numbers=new ArrayList<>(Arrays.asList(24,1,2,3,3,9,24,3,4,3,5,3,5,3));

 - get the unique numbers(one of them) from list
 [24, 1, 2, 3, 9, 4, 5]
     */

    public static void main(String[] args) {
        List<Integer> numbers=new ArrayList<>(Arrays.asList(24,1,2,3,3,9,24,3,4,3,5,3,5,3));
        ArrayList<Integer> result=new ArrayList<>();

        for (Integer number : numbers) {

            if (!result.contains(number)){
                result.add(number);
            }
        }
        System.out.println(result);
        Set<Integer> set=new HashSet<>(numbers);
        System.out.println(set);


    }
}
