package Replit;

import java.util.Scanner;

/*  Using Scanner class input string value.

Print out the following: "The first 3 letters of \_\_\_ is ___"

```
For example, if the input is "banana", your output should be: "The first 3 letters of banana is ban".
*/
class H1Repl95 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        System.out.println("The first 3 letters of "+str+" is "+str.substring(0,3) );

    }

}

