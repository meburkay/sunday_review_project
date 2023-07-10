package week_15.collections.company;

public class Employee {
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
