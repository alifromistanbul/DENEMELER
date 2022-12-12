package çalışmalar;

public class Ternaries {
    public static void main(String[] args) {
        
        int s = 76;

        String s1 =" ";

         /*       if (s >= 0 && s <= 100){

                    (s > 90) ? "Excellent" : (s > 80) ? "Great" : (s > 70) ? "Good" :
                            (s > 60) ? "Passed" : "Failed"


                }else System.out.println("ınvalıd Score");


                System.out.println("s1 = " + s1);
          */
        if (s>=0 && s<=100){
            
            s1 = (s>=90 && s<= 100)? "Excellent": (s>=80 && s<90)? "Great": (s>=70 && s<80)? "Good":
            (s>=60 && s<70)? "Passed" : "Failed";

        }else{
            s1 = "Invalid Score";
        }

        System.out.println("s1 = " + s1);
        
        
    }
    
    
}
/*
String result = (s>=0 && s<=100)? (s>=60)? "Passed" : "Failed" : "Invalid Score";

        System.out.println(result);

 */
