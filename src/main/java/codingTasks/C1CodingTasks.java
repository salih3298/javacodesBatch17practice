package codingTasks;

import java.util.Arrays;
import java.util.Scanner;

public class C1CodingTasks {
    public static void main(String[] args) {


        int[] temp = new int[7];
        Scanner scanner = new Scanner(System.in);

        for (int row = 0; row < temp.length; row++) {
            temp[row] = scanner.nextInt();
        }
        System.out.print(Arrays.toString(temp));
        System.out.println();
        int highest = temp[0];
        int lowest = temp[0];
        for (int i : temp) {
            if (i > highest) {
                highest = i;
            } else if (i < lowest) {
                lowest = i;

            }

        }
        System.out.println("highest temperature of week is :" + highest + "'C");
        System.out.println("lowest temperature of week is :" + lowest + "'C");
    }
}

