package Homework;

import java.util.Scanner;

/*  Inputs:
String word;
Write a for loop that will print out every other letter in a String,
starting with the first letter.  These letters should be printed all
on one line with no space in between.
Sample input/outputs
In: hello
hlo
In: SSyynnttaaxxTTeecchhnnoollooggiieess
SyntaxTechnologies
*/
class H1Repl101 {
    public static void main(String[] args) {
        System.out.println("Please enter a String");
        Scanner input = new Scanner(System.in);
        String in=input.nextLine();

        String out="";
        for (int i = 0; i < in.length(); i+=2) {
            out=out+in.charAt(i);

        } System.out.println(out);
    }

}

