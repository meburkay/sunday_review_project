package week_15.polymorphism;

public class Mother implements Woman{
    @Override
    public void activity() {
        System.out.println("Mother is taking care of children");
    }
}
