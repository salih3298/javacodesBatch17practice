package Replit;

import java.util.Scanner;

/*  You have Scanner class to input string value.
If language is Java it should print the:
"Java is a programming language".
If language is C it should print the:
"C is a procedural programming language"
If language is C++ it should print the:
"C++ is a middle-level programming language"
If any other should print:
"Doesn't match any programming language"
*/
class H1Repl96 {
    public static void main(String[] args) {

        System.out.println("Please enter a programming language");
        Scanner input = new Scanner(System.in);
        String str=input.nextLine();

        if(str.equals("Java")) {
            System.out.println("Java is a programming language");
        } else if (str.equals("C")){
            System.out.println("C is a procedural programming language");
        }  else if (str.equals("C++")){
            System.out.println("C++ is a middle-level programming language");
        } else {
            System.out.println("Doesn't match any programming language");
        }


    }

}

