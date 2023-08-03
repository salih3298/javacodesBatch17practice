package class5;

import java.util.Scanner;

public class H4DmvRepresentative {
    public static void main(String[] args) {

        int age=18;
        System.out.println("How old are you");
        Scanner input = new Scanner(System.in);
        int  studentAge= input.nextInt();

        if (studentAge>=age) {
            System.out.println("I will issue a driver license to you");
        } else {
            System.out.println("I  will offer you to get a learners permit");
        }
    }
}