package replitWorks_October;

import java.util.Scanner;

public class Replit_27_10_2022 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        String letters = "";
        for(String each : words){

            for(int i = 0; i<each.length();i++){
                char ch = each.charAt(0);
                char ch1 = each.charAt(each.length()-1);
                letters = ""+ch+ch1;
            }
            System.out.println(letters);

        }



    }
}
/*
### Given a `String []` `words` print the first and last character of each String element in the array.
Print the first and last character in the same line with no spaces.

#### Note: The loop used in the given code is to dynamically create the String array. You don't need to fully
understand this part yet, focus only on having access to an array.

Main topics: arrays, primitive datatypes, concatenation, index, operators, loops, String

Example:
```
Input:
  ["hello", "why", "by", "apple" , "note"]

Output:
  ho
  wy
  by
  ae
  ne
```
*/

