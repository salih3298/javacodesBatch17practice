package class6;

import java.util.Scanner;

public class T5SwitchStatements {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the name of the country");
        String country = input.nextLine();

        switch (country) {
             case "US":
                 System.out.println("English");
                 break;
             case "Turkey":
                 System.out.println("Turkish");
                 break;
             case "Germany":
                 System.out.println("German");
                 break;
             case "France":
                 System.out.println("French");
                 break;

             default:
                 System.out.println("Wrong Country");
         }
    }
}
