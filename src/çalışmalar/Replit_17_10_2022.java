package çalışmalar;

import java.util.Scanner;

public class Replit_17_10_2022 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        //WRITE YOUR CODE BELOW

        int count = 0;

        while(str.contains("hi")){
            str = str.replaceFirst("hi","");
            count++;
        }
        System.out.println(count);



    }
}
/*
### Use a `loop` to count how many times the characters `hi` are found in the given String `str`.
Only consider the lowercase characters for `hi`.

Main topics: loops, primitive datatypes, operators, Scanner, String, if statements

```
Ex:
  Input:
    abc hi how

  Output:
    1
```
```
Ex:
  Input:
    hihi bye

  Output:
    2
```
```
Ex:
  Input:
    apple

  Output:
    0
```
*/




