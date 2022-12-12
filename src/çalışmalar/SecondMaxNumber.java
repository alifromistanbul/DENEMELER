package çalışmalar;

import java.util.Arrays;

public class SecondMaxNumber {
    public static void main(String[] args) {

        int[] numbers = {999, 781, 856, 995, 1030, 36 ,435};
        int max = numbers[0];

        for(int i=0; i<numbers.length;i++){
            if(numbers[i]>max){
                max = numbers[i];
            }
        }

        int max2 = 0;
        if(numbers[0]!=max){
            max2 = numbers[0];
        }else {
            max2 = numbers[1];
        }

        for(int i=0; i<numbers.length; i++){
            if(numbers[i]>max2 && numbers[i]<max){
                max2 = numbers[i];
            }

        }
        System.out.println(max2);


    }
}
