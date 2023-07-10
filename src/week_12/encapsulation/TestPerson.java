package week_12.encapsulation;

public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person();
        // person.name="12234"; // we cut the connection between variable in order to control it
        person.setName("Adam");
        //  person.age=-12; // we cut the connection between variable in order to control it
        person.setAge(34);
        System.out.println(person);
        System.out.println(person.getAge());
        System.out.println(person.getName());
    }
}
