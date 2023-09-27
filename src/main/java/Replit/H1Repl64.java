package Replit;

import java.util.Scanner;

public class H1Repl64 {
    public static void main(String[] args) {
        /*You should input:
int end;
Write a for loop that will print out a series of numbers starting at
0 and ending at the doubled value of end(value must be taken from a user), exclusive.
Each number should be on the same line, separated by a space.
         */
        System.out.println("Please enter a value");
        Scanner inp=new Scanner(System.in);
        int end=inp.nextInt();

        for (int i = 0; i < 2*end; i++) {
            System.out.print(i+" ");

        }

    }
}

