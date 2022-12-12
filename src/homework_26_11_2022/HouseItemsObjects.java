package homework_26_11_2022;

import java.util.ArrayList;
import java.util.Arrays;

public class HouseItemsObjects {
    public static void main(String[] args) {

        HouseItems a = new HouseItems("table","Brown",2);
        HouseItems b = new HouseItems("TV","Black",1);
        HouseItems c = new HouseItems("Laptop","Grey",1);
        HouseItems d = new HouseItems("Armchair","Bej",3);

        ArrayList<HouseItems> houseItems = new ArrayList<>(Arrays.asList(a,b,c,d));

        for(HouseItems each : houseItems){
            System.out.println(each);
        }





    }
}
