package Homework;

import java.util.Scanner;

public class H1Repl104 {
    public static void main(String[] args) {


        String[] array = new String[5];
        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < 5; i++) {
            array[i] = scanner.next();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i].substring(0, 3));
        }

        System.out.println();


    }
}
