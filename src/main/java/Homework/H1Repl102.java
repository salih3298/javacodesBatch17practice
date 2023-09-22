package Homework;

import java.util.Scanner;

/*  Inputs:
String word;
Write a for loop that will loop through every character of a word and print out each character, each on a separate line
 Sample inputs/outputs:
In: hello
h
e
l
l
o
*/
class H1Repl102 {
    public static void main(String[] args) {

        System.out.println("Please enter a String");
        Scanner input=new Scanner(System.in);
        String word= input.nextLine();

        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));

        }

    }

}

