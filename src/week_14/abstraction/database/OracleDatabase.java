package week_14.abstraction.database;

public class OracleDatabase extends Database{


    @Override
    void add(String name) {
        names.add(name);
        System.out.println("I added " + name + " in Database");
    }

    @Override
    void delete(String name) {
names.remove(name);
    }

    @Override
    void update(String old, String newName) {

        int indexOfOldName = names.indexOf(old);
        names.set(indexOfOldName,newName);
    }
}
