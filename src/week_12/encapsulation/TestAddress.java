package week_12.encapsulation;

import java.util.regex.Pattern;

public class TestAddress {

    public static void main(String[] args) {

        Address address1=new Address("Street1","Bursa",16000,"Turkey");

        System.out.println(address1);

        Address address2=new Address(" ","Bursa",16000,"Turkey");

        System.out.println(address2);


    }
}
