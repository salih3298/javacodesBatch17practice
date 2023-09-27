package Replit;

import java.util.Scanner;

/* Given the following inputs:
String s;
Write a for loop that will print out each letter of the string s, separated by spaces, on the same line.
Sample input/outputs:
```
In: hello
h e l l o
*/
class H1Repl103 {
    public static void main(String[] args) {

        System.out.println("Please enter a String");
        Scanner input=new Scanner(System.in);
        String word= input.nextLine();

        for (int i = 0; i < word.length(); i++) {
            System.out.print(word.charAt(i)+" ");

        }

    }

}

