package Replit;

import java.util.Scanner;

public class H1Repl65 {
    public static void main(String[] args) {
        /* Given the following inputs:
int x;
Write a for loop that will print out a series of numbers starting at one less than x and ending at 0.
         */

        System.out.println("Please enter a value");
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        for (int i =x-1; i >=0 ; i--) {
            System.out.print(i+" ");
        }
    }
}

