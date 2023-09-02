package class5;

import java.util.Scanner;

public class R22Scanner {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = input1.next();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter your mobile number");
        String mobileNumber = input2.next();
        Scanner input3 = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = input3.nextInt();

        System.out.println("Your name is " + name + ", your age is " + age + " and your mobile number is " + mobileNumber);
    }

}

