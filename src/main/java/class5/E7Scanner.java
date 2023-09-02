package class5;

import java.util.Scanner;

public class E7Scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your name");
        String name=scanner.next();
        if (name.equals("Salih")) {
            System.out.println("Senior SDET in 2 years");
        } else if (name.equals("Ali")) {
            System.out.println("I live in Turkey");
        } else if (name.equals("gaga")) {
            System.out.println("What are you doing");
        }
    }

}
