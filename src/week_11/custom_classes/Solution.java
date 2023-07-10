package week_11.custom_classes;

import java.util.Scanner;

class  Teacher{
    public  String name;
    public int age;
    public char gender;

    public Teacher(String name, int age, char gender) {
        // this.name = name;
        // this.age = age;

        this(name, age);
        this.gender = gender;

    }

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Teacher() {
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

 }

 class BMW{

 }

 class Mercedes{

 }
 class Audi{

 }


public class Solution {
    public static void main(String[] args) {

        week_11.custom_classes.constructors.Teacher teacher1=new week_11.custom_classes.constructors.Teacher("Adam",34,'M');
        week_11.custom_classes.constructors.Teacher teacher2=new week_11.custom_classes.constructors.Teacher("Aysun",25);

        System.out.println(teacher2);

        teacher2.gender='F';
        System.out.println(teacher2);




        week_11.custom_classes.constructors.Teacher teacher3=new week_11.custom_classes.constructors.Teacher();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter teacher name");

        teacher3.name=scanner.nextLine();
        System.out.println("Enter teacher age");
        teacher3.age= scanner.nextInt();
        System.out.println("Enter gender");

        teacher3.gender=scanner.next().charAt(0);

        System.out.println(teacher3);

    }
}
