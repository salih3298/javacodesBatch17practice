package Replit;

import java.util.Scanner;

public class H1Repl63 {
    public static void main(String[] args) {
        /*Given the following inputs:
int x;
Write a for loop that will print out a series of numbers starting
at 0 and ending at the x(value must be taken from a user), exclusive.
         */
        System.out.println("Please enter a value");
        Scanner input =new Scanner(System.in);
        int x=input.nextInt();

        for (int i = 0; i <x ; i++) {
            System.out.println(i);
        }


    }
}

