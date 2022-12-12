package homeWork_23_09_2022;

public class OperationSystems {
    public static void main(String[] args) {

        String OS = "Mac";

        boolean isMAC = true;
        boolean isLenova = true;
        boolean isIphone = true;
        boolean isSamsun = true;


        if (isMAC) {
            System.out.println("MacOs");
        } else if (isLenova) {
            System.out.println("Windows");
        } else if (isIphone) {
            System.out.println("IOS");
        } else {
            System.out.println("Samsung");

        }


    }


}

/*
public class GrandeReport {
    public static void main(String[] args){
        int score = 100;
        char grade;// A, B, C, D, F

        if(score>=90){
            System.out.println("Your grade is A");
        }else if(score>=80 && score<90){
            System.out.println("Your grade is B");
        }else if(score>=70 && score<80){
            System.out.println("Your grade is C");
        }else if(score>=60 && score<70){
            System.out.println("Your grade is D");
        }else{
            System.out.println("Your grade is F");
        }

        System.out.println("---------------------------");

        if(score>=90){
            grade = 'A';
        }else if(score>=80){
            grade = 'B';
        }else if(score>=70){
            grade = 'C';
        }else if(score>=60){
            grade = 'D';
        }else{
            grade = 'F';
        }
        System.out.println("Your grade is " + grade);

    }



}



 */