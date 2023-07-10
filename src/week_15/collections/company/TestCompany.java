package week_15.collections.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestCompany {
    static List<Employee> employees;

    static {
        employees = new ArrayList<>();

        Tester tester1 = new Tester(1, "Burak");
        Tester tester2 = new Tester(2, "Cağla");
        Tester tester3 = new Tester(3, "Ramazan");
        Tester tester4 = new Tester(4, "Emre");
        Tester tester5 = new Tester(5, "Pazilya");
        List<Tester> testers = new ArrayList<>(Arrays.asList(tester5, tester1, tester2, tester4, tester3));

        Developer developer1 = new Developer(1, "Mustafa");
        Developer developer2 = new Developer(2, "Melih");
        Developer developer3 = new Developer(3, "Serhat");
        Developer developer4 = new Developer(4, "Emirhan");
        Developer developer5 = new Developer(5, "Burak");
        Developer developer6 = new Developer(6, "Harun");
        Developer developer7 = new Developer(7, "Edip");

        List<Developer> developers = new ArrayList<>(Arrays.asList(developer1, developer2, developer4, developer5, developer6, developer7, developer3));
        PO po1 = new PO(1, "Mehmet");
        PO po2 = new PO(2, "Ahmet");
        PO po3 = new PO(3, "Serhat");
        PO po4 = new PO(4, "Merve");
        List<PO> pos = new ArrayList<>(Arrays.asList(po2, po1, po4, po3));

        employees.addAll(testers);
        employees.addAll(developers);
        employees.addAll(pos);


    }

    public static void main(String[] args) {

        System.out.println(getTesters());
        System.out.println("==============");
        System.out.println(getDevelopers());

    }


    public static List<Employee> getTesters() {
        /*
        List<Employee> list=new ArrayList<>();
        for (Employee employee : employees) {
            if (employee instanceof Tester)
                list.add(employee);
        }

         */


      List<Employee> temp=new ArrayList<>(employees);
        temp.removeIf(k->!(k instanceof Tester));

       return temp;
    }

    public static List<Employee> getDevelopers() {
        List<Employee> temp=new ArrayList<>(employees);
        temp.removeIf(k->!(k instanceof Developer));

        return temp;
    }

    public static List<Employee> getPOs() {
        List<Employee> temp=new ArrayList<>(employees);
        temp.removeIf(k->!(k instanceof PO));

        return temp;
    }
}
