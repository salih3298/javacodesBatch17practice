package Homework;

import java.util.Scanner;

public class H1Repl36 {
    public static void main(String[] args) {
  /*For you to do:**
Prompt user to input two strings : "Please enter two strings"and two integers: "Please enter two numbers"
and make the comparisons:
- if int1 and int2 are equal **and** word1 and word2 are equal, output "AND"
- if int1 and int2 are equal **or** word1 and word2 are equal, output "OR"
- if int1 and int2 are **not** equal **and** word1 and word2 are **not** equal, output "NONE"*/

        System.out.println("Please enter two strings");
        Scanner input = new Scanner(System.in);
        String word1 = input.nextLine();
        String word2 = input.nextLine();
        System.out.println("Please enter two numbers");
        int int1 = input.nextInt();
        int int2 = input.nextInt();

        if (int1 == int2 && word1.equals(word2)) {
            System.out.println("AND");
        } else if (int1 == int2 || word1.equals(word2)) {
            System.out.println("OR");
        } else {
            System.out.println("NONE");

        }


    }
}
