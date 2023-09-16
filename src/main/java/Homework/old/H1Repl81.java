package Homework;

public class H1Repl81 {
    public static void main(String[] args) {
        int input [] = {5,4,8};
        int largest=0;
        for (int  i = 0;  i < input.length;  i++) {
            if (input[i]>largest) {
                largest=input[i];

            }

        }

        System.out.println(largest);
    }
}
