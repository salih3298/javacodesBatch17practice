package class7;

import java.util.Scanner;

public class E12DoWhileLoop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);

        String input;

        do {
            System.out.println("Please enter your name or shutdown to close program");
            input=scanner.nextLine();
            System.out.println("You are great "+input);
        } while (!input.equalsIgnoreCase("shutdown"));

  }
}
