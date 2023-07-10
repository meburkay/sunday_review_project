package week_15.collections;

import java.util.*;

public class Task2 {
    /*
    Task 2

 --    create a list put the names
         ahmet
         rafet
         mehmet
         saffet
         temel
     -- create a method and return the sorted list which are unique
      ahmet ,mehmet,rafet,saffet,temel
     */
    public static void main(String[] args) {

        List<String> names=new ArrayList<>(Arrays.asList("rafet","ahmet","mehmet","saffet","temel"));
       List<String> result= getUniqueNames(names);
    }

    private static List<String> getUniqueNames(List<String> names) {
        Set<String> set=new TreeSet<>(names); //got the unique names in sorted
        List<String> result=new ArrayList<>(set); //put inside the unique names in a list
        return result; //return the result


       // return new ArrayList<>(new TreeSet<>(names));
    }
}
