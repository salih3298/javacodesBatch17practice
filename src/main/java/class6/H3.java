package class6;

import java.util.Scanner;

public class H3 {
    public static void main(String[] args) {

/*Ask user to enter their country and capture it. Once values are captured print which language user speaks.*/

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your country");
        String country = input.nextLine();

        if (country.equalsIgnoreCase("united states")) {
            System.out.println("English");
        } else if (country.equalsIgnoreCase("turkey")) {
            System.out.println("Turkish");
        } else if (country.equalsIgnoreCase("germany")) {
            System.out.println("German");
        } else  {
            System.out.println("Country not supported");
            }
        }
    }
