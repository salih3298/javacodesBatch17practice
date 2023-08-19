package class6;


import java.util.Scanner;

public class T3LogicalOperators {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter day number");
        int dayNum = input.nextInt();

        if (dayNum < 6) {
            System.out.println("It is a weekday");
        } else if (dayNum < 8) {
            System.out.println("It is a weekend");
        } else {
            System.out.println("Invalid day");
        }
    }
}
