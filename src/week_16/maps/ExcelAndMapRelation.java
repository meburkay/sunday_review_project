package week_16.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExcelAndMapRelation {

    public static void main(String[] args) {

        Map<String,String> student1=new HashMap<>();
        student1.put("id","1");
        student1.put("name","Yunus");
        student1.put("gender","Male");

        Map<String,String> student2 =new HashMap<>();
        student2.put("id","2");
        student2.put("name","Elif");
        student2.put("gender","Female");


        Map<String,String> student3 =new HashMap<>();
        student3.put("id","3");
        student3.put("name","Burak");
        student3.put("gender","Male");

        Map<String,String> student4 =new HashMap<>();
        student4.put("id","4");
        student4.put("name","Serhat");
        student4.put("gender","Male");

        Map<String,String> student5 =new HashMap<>();
        student5.put("id","5");
        student5.put("name","Eray");
        student5.put("gender","Male");




        List<Map<String,String>> students=new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        System.out.println(students);


        //get the student name which has id is 3
        String name="";

        for (Map<String, String> eachStudent : students) {
            if (eachStudent.get("id").equals("3")){
                name=eachStudent.get("name");
                break;
            }
        }

        System.out.println(name);


    }
}
