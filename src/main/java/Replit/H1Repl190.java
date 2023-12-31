package Replit;

import java.util.LinkedList;

/*
CCreate Linked List that will store first 10 numbers of fibonacci series

Print number from Linked List 1 by 1 all in 1 line

**Expected Output:**

```
0 1 1 2 3 5 8 13 21 34
```*/
public class H1Repl190 {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(0);
        linkedList.add(1);
        for (int i = 2; i < 10; i++) {
            int num = linkedList.get(i - 1) + linkedList.get(i - 2);
            linkedList.add(num);
        }

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.print(linkedList.get(i) + " ");
        }


    }

}



