package week_11.custom_classes.constructors;

import java.util.Scanner;

public class TestTeacher {

    public static void main(String[] args) {

        Teacher teacher1=new Teacher("Adam",34,'M');
        Teacher teacher2=new Teacher("Aysun",25);

        System.out.println(teacher2);

        teacher2.gender='F';
        System.out.println(teacher2);




        Teacher teacher3=new Teacher();
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
