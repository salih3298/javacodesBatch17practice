package Replit;

import java.util.Scanner;

public class H1Repl34 {
    public static void main(String[] args) {
  /*Write a program to find the largest number among three
  distinct numbers using nested if condition
Please use Scanner class to take input from users*/

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter 3 distinct numbers");
        int num1=input.nextInt();
        int num2=input.nextInt();
        int num3=input.nextInt();

        if (num1>num2 && num1>num3) {
            System.out.println("The largest number is "+num1);
        } else if (num2>num1 && num2>num3) {
            System.out.println("The largest number is "+num2);
        } else {
            System.out.println("The largest number is "+num3);
        }

    }
}
