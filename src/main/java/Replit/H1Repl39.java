package Replit;

import java.util.Scanner;

public class H1Repl39 {
    public static void main(String[] args) {
  /*A school has following rules for grading system:
a. 1 to 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask the user to enter marks and print the corresponding grade.
**Example Output:**
Please enter your mark
Your grade is A

**Example Output:**
Please enter your mark
Please enter valid mark
*/

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your mark");
        int grade = input.nextInt();

        if (grade > 0 && grade < 25) {
            System.out.println("Your grade is F");
        } else if (grade >= 25 && grade < 45) {
            System.out.println("Your grade is E");
        } else if (grade >= 45 && grade < 50) {
            System.out.println("Your grade is D");
        } else if (grade >= 50 && grade < 60) {
            System.out.println("Your grade is C");
        } else if (grade >= 60 && grade < 80) {
            System.out.println("Your grade is B");
        } else if (grade >= 80 && grade <= 100) {
            System.out.println("Your grade is A");
        } else {
            System.out.println("Please enter valid mark");
        }


    }
}
