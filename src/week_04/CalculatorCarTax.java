package week_04;

public class CalculatorCarTax {

    public static void main(String[] args) {

        int price = 35000;
        double tax = 0;

        if (price >= 20_000 & price <= 39_999){
            tax = price * 0.2;
        }else if (price >= 40_000 & price <= 59_999) {
            tax = price * 0.3;
        }else if (price >= 60_000 & price <= 80_000) {
            tax = price * 0.4;
        }

    }

}
/*
Task 5: Create a class which is "CalculateCarTax"
        if the price between $20000 and $39999 taxRate=0.2
        if the price between $40000 and $59999 taxRate=0.3
        if the price between $60000 and $80000 taxRate=0.4

 */
