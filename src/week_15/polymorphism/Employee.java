package week_15.polymorphism;

public class Employee implements Woman{
    @Override
    public void activity() {
        System.out.println("Doing her job");
    }
}
