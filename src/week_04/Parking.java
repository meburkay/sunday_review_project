package week_04;

public class Parking {

    public static void main(String[] args) {
        int timeVariable= 3;
        double fee = timeVariable >= 6 && timeVariable <= 12 ? 7.5 : 15;

        System.out.println("fee = " + fee);



    }

}
/*
Task 7: Parking [ternary, relational]

    create a program that will define a time variable. Use a 24 hour format. Based on the given time determine the cost of parking in the city

        If the time is between 6-12:
            fee: 7.50

        if the time is between 13 - 23 or 0 - 5
            fee is 15
 */