package week_14.exceptions.try_catch_finaly;

public class TryCatchFinally {

    public static void main(String[] args) {

        try {
            System.out.println("App is started");
            System.out.println(10/0);
        }catch (Exception e){
            System.out.println("We have a problem");
            System.out.println(10/0);
        }
        finally {
            System.out.println("App is closed");
       }
        System.out.println("hi");


    }
}
