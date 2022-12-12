package replitWorks_October;

import java.util.Scanner;

public class Replit_19_10_2022 {
    public static void main(String[] args) {



        //WRITE YOUR CODE BELOW
                Scanner scanner = new Scanner(System.in);

                String x = scanner.nextLine();
                String y = "";
                for (int i = 0; i < x.length(); i++) {
                    char current = x.charAt(i);
                    if (y.indexOf(current)<0){
                        y +=current;
                    }
                    else {
                        y = y.replace(String.valueOf(current), "");
                    }
                }
                System.out.println(y + "");
            }
        }





/*
### Use a `loop` to count how many times the characters `cat` and `dog` are found in the given String `str`. Output `true` if `cat` and `dog` appear the same number of times, otherwise output `false`
Main topics: loops, primitive datatypes, operators, Scanner, String, if statements

```
Ex:
  Input:
    catdog

  Output:
    true
```
```
Ex:
  Input:
    catcat

  Output:
    false
```
```
Ex:
  Input:
    cat-cheetah-dog-cat

  Output:
    false
```
 */
