package day13_Practices;

public class CheckWords {
    public static void main(String[] args) {

        String word1 = "Cydeo";
        String word2 = "Wooden";
        String word3 = "Spoon";

        int a = word1.length();
        int b = word2.length();
        int c = word3.length();

        if(a == b & a == c){
            System.out.println("All words are same length");
        }else if (a == b && a!=c || a==c && a!=b || b==c && b!=a){
            System.out.println("Not same nor different lengths");
        }else{
            System.out.println("All different length");
        }


    }



}
/*
Write a program  for CheckWords, the program accepts 3 words and :
- if they are same length:  print "All words are same length"
- if some same length and others not:    print "Not Same nor
Different lengths"
- if all different length :  print "All different length"

 */
