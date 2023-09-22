package Homework;

import java.util.Scanner;

/* Create an array of names that will hold 5 String elements.
Names must be taking from a user.
Print out the first three characters of each element of the array, one per line.
Note: every array element must be at least 3 characters long.
Input Example:
John
Jane
Jimmy
Mike
Emily
Expected Output:
**Joh**
**Jan**
**Jim**
**Mik**
**Emi**
*/
class H1Repl104 {
    public static void main(String[] args) {

        System.out.println("Please enter a String name");
        String[] word = new String[5];
        Scanner input = new Scanner(System.in);
        //String [] word= new String[]{input.nextLine()};

        for (int i = 0; i < 5; i++) {
            word[i] = input.nextLine();
        }
        for (int i = 0; i < 5; i++) {
            if (word[i].length() >= 3) {
                System.out.println(word[i].substring(0, 3));
            }

        }

    }

}

