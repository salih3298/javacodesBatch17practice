package Replit;

import java.util.Scanner;

public class H1Repl37 {
    public static void main(String[] args) {
  /*For you to do:**
   Take 2 boolean inputs from a user:
   "Are you thirsty?"
   "Are you sleepy?"
   If user is thirsty and not sleepy--> drink=water
   If user is thirsty and sleepy--> drink=coffee
   If user is not thirsty and sleepy --> drink=tea
   Otherwise drink="nothing"
   Output:
   - Looks like you need to drink \_\_\_*/

        Scanner input = new Scanner(System.in);
        System.out.println("Are you thirsty?");
        boolean input1 = input.nextBoolean();
        System.out.println("Are you sleepy?");
        boolean input2 = input.nextBoolean();

        if (input1 && !input2) {
            System.out.println("Looks like you need to drink water");
        } else if (input1 && input2) {
            System.out.println("Looks like you need to drink coffee");
        } else if (!input1 && !input2) {
            System.out.println("Looks like you need to drink tea");
        } else {
            System.out.println("Looks like you need to drink nothing");
        }

    }
}
