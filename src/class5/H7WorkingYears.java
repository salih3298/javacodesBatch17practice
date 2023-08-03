package class5;

import java.util.Scanner;

public class H7WorkingYears {
    public static void main(String[] args) {

        System.out.println("How many years you have worked?");
        Scanner input1 = new Scanner(System.in);
        int workingYears = input1.nextInt();

        if (workingYears<5) {
            System.out.println("You are not eligible for bonus");
            //  System.out.println("I can offer you a credit card");
        } else {
            System.out.println("What is your annual salary");
        }
        double annualSalary = input1.nextDouble();

        if (annualSalary > 50000) {
            System.out.println("You are eligible for 5000 bonus");
        } else {
            System.out.println("You are eligible for 3000 bonus");
        }
    }
}

