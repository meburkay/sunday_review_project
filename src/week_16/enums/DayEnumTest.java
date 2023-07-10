package week_16.enums;

public class DayEnumTest {


    public static void main(String[] args) {

        System.out.println(Days.FRIDAY); //we are seeing FRIDAY as a value

        //I want to see Friday
        System.out.println(Days.FRIDAY.value);


        System.out.println(DayEnum.THURSDAY.value +" " + Days.THURSDAY);
    }
}
