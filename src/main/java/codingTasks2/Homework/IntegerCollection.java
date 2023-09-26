package codingTasks2.Homework;

import java.util.ArrayList;
import java.util.List;

public class IntegerCollection {
    /* * Create a collection of integers in which you can keep duplicates.
Write a logic to find sum of all integers*/
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();

        integerList.add(32);
        integerList.add(45);
        integerList.add(5);
        integerList.add(98);
        integerList.add(40);

        int sum = sumIntegers(integerList);

        System.out.println("Sum of integers: " + sum);
    }
    public static int sumIntegers(List<Integer> integerList) {
        int sum = 0;

        for (Integer num : integerList) {
            sum += num;
        }

        return sum;
    }
}
