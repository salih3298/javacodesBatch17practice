package Replit;

import java.util.Scanner;

/*  Write code that will take in a String input and check to see if it is a palindrome or not.
A palindrome means that the characters are the same forwards and backwards, **ignoring spaces.**
Examples of palindromes:
- racecar
- was it a car or a cat I saw
- never odd or even
- rats live on no evil star
Your check should be case insensitive too.  For example, "Bob" is a palindrome, despite the first B being capitalized.
Your program will print out "true" if it's a palindrome and "false" if not.
*/
class H1Repl99 {
    public static void main(String[] args) {

        System.out.println("Please enter a String");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        word.replaceAll(" ", "");
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }

        if (word.equalsIgnoreCase(reverse)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }


    }

}

