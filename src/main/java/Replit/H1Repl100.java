package Replit;

import java.util.Scanner;

/*  Given the following inputs:
String s;
Write a for loop that will print out the reverse of the string.
Sample input/outputs:
In: manhattan
nattahnam
In: processor
rossecorp
In: racecar
racecar
*/
class H1Repl100 {
    public static void main(String[] args) {
        System.out.println("Please enter a String");
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse=reverse+s.charAt(i);
        }
        System.out.println(reverse);

    }

}

