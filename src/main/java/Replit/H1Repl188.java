package Replit;

import java.util.ArrayList;
import java.util.Scanner;

/*
Using Scanner class add 5 elements into ArrayList and then print all elements from that ArrayList all in 1 line

Numbers in:
4
62
8
5
4
**Expected Output:**

4 62 8 5 4
```
```*/
public class H1Repl188 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        System.out.println("Please enter 5 numbers");
        Scanner input = new Scanner(System.in);
        for (int i = 1; i < 6; i++) {
            int numbers = input.nextInt();
            arrayList.add(numbers);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i)+" ");
        }

    }
}
