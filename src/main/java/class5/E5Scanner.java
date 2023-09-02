package class5;

import java.util.Scanner;

public class E5Scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your Gender F/M");
        char gender=scanner.next().charAt(0);
        System.out.println("Your Gender is "+gender);


    }
}
