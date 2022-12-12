package çalışmalar;

import java.util.Scanner;

public class Replit_12_10_2022 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if((word.startsWith("x") || word.startsWith("X")) && (word.endsWith("x") || word.endsWith("X"))){
            word = word.substring(1,word.length()-1);
        }else if(word.startsWith("x") || word.startsWith("X")){
            word= word.substring(1);
        }else if(word.endsWith("x") || word.endsWith("X")){
            word = word.substring(0,word.length()-1);
        }else{
            word = word;
        }
            System.out.println(word);
    }





}
/*
### Use `String methods` to modify the given `word` based on the following rules:

> - If `word` starts with or ends with `x` or `X` print the String without those `x` characters
> - If there is no `x` or `X` as the first or last character print the `word` untouched

Main topics: String manipulation, Scanner, methods, primitive datatypes, concatenation

```
Ex:
  Input:
    xHiX

  Output:
    Hi
```
```
Ex:
  Input:
    apple

  Output:
    apple
```
```
Ex:
  Input:
    xUxL

  Output:
    UxL
```
```
Ex:
  Input:
    JavaX

  Output:
    Java
```

*/
