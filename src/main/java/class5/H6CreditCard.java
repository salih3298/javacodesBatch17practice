package class5;

import java.util.Scanner;

public class H6CreditCard {
    public static void main(String[] args) {

        System.out.println("Do you have a credit card or not?");
        Scanner input1 = new Scanner(System.in);
        String creditCard = input1.next();


        if (creditCard.equals("No")) {
            System.out.println("I can offer you a credit card ");
            //  System.out.println("I can offer you a credit card");
        } else {
            System.out.println("What is the balance on the credit card");
        }
        double balance = input1.nextDouble();

        if (balance > 1000) {
            System.out.println("You should pay off immediately");
        } else {
            System.out.println("You can spend more");
        }
    }
}

