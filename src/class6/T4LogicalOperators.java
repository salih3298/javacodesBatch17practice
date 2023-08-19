package class6;


import java.util.Scanner;

public class T4LogicalOperators {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = input.nextInt();

        if (num < 11 && num > 0) {
            System.out.println("Small");
        } else if (num <= 100 && num > 11) {
            System.out.println("Medium");
        } else {
            System.out.println("Large");
        }
    }
}
