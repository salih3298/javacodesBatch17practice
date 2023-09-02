package class6;


import java.util.Scanner;

public class T2LogicalOperators {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your heights in inches");
        double heights = input.nextDouble();

        if (heights < 60) {
            System.out.println("Short");
        } else if (heights < 72) {
            System.out.println("Medium");
        } else {
            System.out.println("Tall");
        }
    }
}
