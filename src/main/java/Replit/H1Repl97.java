package Replit;

import java.util.Scanner;

/*  Based on the user inputs program should give a correct answer.
If browser is Chrome or Chrome or CHROME or ChRoMe it should print the:
"Proceed with Chrome browser"
If browser is firefox, FIREFOX or FireFOX it should print the:
"Proceed with Firefox browser"
If browser is IE, ie or iE it should print the:
"Proceed with IE browser"
If any other browser it should print the:
"Invalid browser"
*/
class H1Repl97 {
    public static void main(String[] args) {
        System.out.println("Please enter browser name");
        Scanner input=new Scanner(System.in);
        String browser=input.nextLine();

        if(browser.equals("Chrome") || browser.equals("CHROME") ||browser.equals("ChRoMe") || browser.equals("chrome")) {
            System.out.println("Proceed with Chrome browser");
        } else if (browser.equals("firefox") || browser.equals("FIREFOX") ||browser.equals("FireFOX") ) {
         System.out.println("Proceed with Firefox browser");
        } else if (browser.equals("IE") || browser.equals("ie") ||browser.equals("iE") ) {
            System.out.println("Proceed with IE browser");
        } else {
            System.out.println("Invalid browser");
        }


    }

}

