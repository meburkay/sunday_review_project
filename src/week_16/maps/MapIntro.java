package week_16.maps;

import java.util.HashMap;
import java.util.Map;

public class MapIntro {

    public static void main(String[] args) {

        //how to create a map

        Map<Integer,String> studentWithNum =new HashMap<>();

        //how to add a pair
        studentWithNum.put(1,"Eyup");
        studentWithNum.put(2,"Ramazan");

        //how to get the value

        System.out.println(studentWithNum.get(2));

        //how to update value
        System.out.println("============before replace");
        System.out.println(studentWithNum.get(1));
        studentWithNum.replace(1,"Burak");
        System.out.println("============after replace");
        System.out.println(studentWithNum.get(1));
        studentWithNum.put(1,"Eyup");
        System.out.println("============after put");
        System.out.println(studentWithNum.get(1));

        // how to understand do you have key or not in your map

        System.out.println(studentWithNum.containsKey(1));
        System.out.println(studentWithNum.containsKey(3));

        //how to remove pair from map

        studentWithNum.remove(2);
        System.out.println(studentWithNum.containsKey(2));
        System.out.println(studentWithNum.get(2));

        //how to remove all pairs from map

        studentWithNum.clear();
        System.out.println(studentWithNum);


    }
}
