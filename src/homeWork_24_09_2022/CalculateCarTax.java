package homeWork_24_09_2022;

public class CalculateCarTax {
    /*
    Task 5: Create a class which is "CalculateCarTax"
        if the price between $20000 and $39999 taxRate=0.2
        if the price between $40000 and $59999 taxRate=0.3
        if the price between $60000 and $80000 taxRate=0.4


     */

    public static void main(String[] args) {

        int price = 70000;

        if(price>=20000 && price <40000){
            double taxRate = 0.2;
            System.out.println("Tax rate is 0.2 and Car price is " + (price + price*taxRate));
        }else if(price>=40000 && price<60000){
            double taxRate = 0.3;
            System.out.println("Tax rate is 0.3 and Car price is " + (price + price*taxRate));
        }else if(price>=60000 && price<=80000){
            double taxRate = 0.4;
            System.out.println("Tax Rate is 0.4 and Car price is " + (price + price*taxRate));
        }


    }


}
