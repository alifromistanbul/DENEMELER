package çalışmalar;

import java.lang.reflect.Array;

public class MaxNumberOfArray {
    public static void main(String[] args) {

        int[] numbers = {4, 781, 8, 99, 103};
        int max = numbers[0];


        for(int i= 0; i<numbers.length; i++){
            if(numbers[i]>max){
                max = numbers[i];
            }
        }
        System.out.println(max);



    }
}
