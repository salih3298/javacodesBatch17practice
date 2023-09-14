package Homework;

import java.util.Scanner;

public class H1Repl38 {
    public static void main(String[] args) {
  /*Prompt user with a question: "Is it weekend?"

If it is not a weekend --> subject="manual testing"

Otherwise --> subject="Java"

**Output**:

```
Today you will be learning ____*/

        System.out.println("Is it weekend");
        Scanner input = new Scanner(System.in);
        boolean day = input.nextBoolean();

        if (day) {
            System.out.println("Today you will be learning Java");
        } else {
            System.out.println("Today you will be learning manual testing");
        }

    }
}
