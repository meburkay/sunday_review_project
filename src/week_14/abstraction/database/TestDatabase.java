package week_14.abstraction.database;

public class TestDatabase {

    public static void main(String[] args) {

        OracleDatabase oracleDatabase=new OracleDatabase();

        oracleDatabase.add("Burak");
        System.out.println(oracleDatabase.names);
        oracleDatabase.add("Yunus");
        System.out.println(oracleDatabase.names);
        oracleDatabase.add("Ozkan");
        System.out.println(oracleDatabase.names);
        oracleDatabase.update("Burak","Wakil");
        System.out.println(oracleDatabase.names);


    }
}
