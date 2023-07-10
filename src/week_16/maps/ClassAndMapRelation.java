package week_16.maps;

import java.util.HashMap;
import java.util.Map;

public class ClassAndMapRelation {

    public static void main(String[] args) {
        Student studentObject1=new Student();

        Map<String,String> studentMap1=new HashMap<>();

        //add field in map
        studentMap1.put("id","1");
        studentMap1.put("name","Melih");
        studentMap1.put("gender","Male");
        //add field for object
        studentObject1.setId("1");
        studentObject1.setName("Melih");
        studentObject1.setGender("Male");

        System.out.println("Map Object");
        System.out.println(studentMap1);
        System.out.println("==========");
        System.out.println("Student Object");
        System.out.println(studentObject1);


    }

}
