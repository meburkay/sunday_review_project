package week_15.polymorphism;

public class TestWoman {

    public static void main(String[] args) {
        //old way
/*
        Mother mother=new Mother();
        mother.activity();
        Housewife housewife=new Housewife();
        housewife.activity();
        Employee employee=new Employee();
        employee.activity();

 */
        //polymorphic way
    //  Reference Type    reference            Object Type
        Woman             woman       =         new Mother();
        woman.activity(); // Mother is taking care of children
        woman = new Housewife();
        woman.activity(); //Doing house works
        woman=new Employee();
        woman.activity();

        int a=5;
         a=6;


    }
}
