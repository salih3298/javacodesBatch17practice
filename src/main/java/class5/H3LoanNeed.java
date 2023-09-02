package class5;

import java.util.Scanner;

public class H3LoanNeed {
    public static void main(String[] args) {

        double loanLimit=200000;
        System.out.println("What is the amount of loan is needed?");
        Scanner input = new Scanner(System.in);
        double loanNeed = input.nextDouble();

        if (loanNeed<=loanLimit) {
            System.out.println("We can lend money");
        } else {
            System.out.println("You are rejected");
        }
    }
}