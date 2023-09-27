package Replit;

import java.util.Scanner;

/* There is a code that takes input as a String.
Write a program that will print out only vowels of that string
Sample input/outputs:
```
In: howdyho
oo
*/
class H1Repl105 {
    public static void main(String[] args) {

        System.out.println("Please enter a string");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();


        System.out.println(word.replaceAll("[^aeiouAEIOU]", ""));
    }

}

