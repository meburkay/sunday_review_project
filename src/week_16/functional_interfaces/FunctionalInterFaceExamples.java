package week_16.functional_interfaces;

import java.util.*;
import java.util.function.*;

public class FunctionalInterFaceExamples {
 // static   BiConsumer<Integer,Integer> multiply=(k,v)-> System.out.println(k*v);


    public static void main(String[] args) {

        //6 dfferent funct inter
        /*
        1. Predicate
        2. Consumer
        3. Function
        4. BiPredicate
        5. BiConsumer
        6. BiFunction

         */

     //   ()->{}

        Predicate<String> containsA=k->k.contains("A");


        System.out.println(containsA.test("Adam"));

        Predicate<Integer> isDivisibleBy3=k->k%3==0;

        System.out.println(isDivisibleBy3.test(6));

        Consumer<String> dublicateString=k-> System.out.println(k+k);
        dublicateString.accept("Adam");  //AdamAdam
        //Serhat  tahreS

        Consumer<String> printReverse =k-> {
            String temp="";

            char[] chars = k.toCharArray();

            for (int i = chars.length-1; i >=0 ; i--) {
                temp+=chars[i];
            }
            System.out.println(temp);


        };
        printReverse.accept("Serhat");

        Consumer<String> printReverse2=k-> System.out.println(new StringBuilder(k).reverse());
        printReverse2.accept("Yunus");

        Function<String,String> returnReversed=k->new StringBuilder(k).reverse().toString();
      String reversed=  returnReversed.apply("Burak");
        System.out.println(reversed);


        BiPredicate<String,String> isEqual=(k,v)->k.equals(v);


        System.out.println(isEqual.test("Adam", "Adam"));

        BiConsumer<Integer,Integer> multiply=(k,v)-> System.out.println(k*v);

        multiply.accept(3,4);

        Integer [] arr1={1,2,3};
        Integer [] arr2={4,5,6};
        Integer [] arr3={4,5,6};

        


        BiFunction<Integer[],Integer[], List<Integer>> mergeArrayInAList=(a1,a2)->{
            List<Integer> list=new ArrayList<>();
            for (Integer integer : a1) {
                list.add(integer);
            }
            for (Integer integer : a2) {
                list.add(integer);
            }
            return list;
        };

        System.out.println(mergeArrayInAList.apply(arr1, arr2));

        MyFunctionalInterface<Integer[],Integer[],Integer[], List<Integer>> myFunctionalInterface=(a1,a2,a3)->{
            List<Integer> list=new ArrayList<>();
            for (Integer integer : a1) {
                list.add(integer);
            }
            for (Integer integer : a2) {
                list.add(integer);
            }
            for (Integer integer : a3) {
                list.add(integer);
            }
            return list;
        };


        System.out.println(myFunctionalInterface.myMethod(arr1, arr2, arr3));


    }


}
