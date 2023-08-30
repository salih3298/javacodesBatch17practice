package Homework;

import java.util.Scanner;

public class dfbdfvdfv {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter browser name");
        String browser = sc.nextLine();

        if (browser.equals("Chrome")) {
            System.out.println("Proceed with Chrome browser");
        } else if (browser.equals("FIREFOX")) {
            System.out.println("Proceed with Firefox browser");
        } else if (browser.equals("IE")) {
            System.out.println("Proceed with IE browser");

        } else {
            System.out.println("Invalid browser");
        }
    }

}

