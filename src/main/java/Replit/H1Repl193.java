package Replit;
/*
import java.util.LinkedList;

/*
Create Linked List that will store Integer Objects
Add the values below:

111

222

333

444

555

666

Create a logic to calculate sum of the all the values in list.
Print the result of sum.
**Expected Output:**
"Result of sum is" 2331
```*//*
public class H1Repl193 {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(111);
        linkedList.add(222);
        linkedList.add(333);
        linkedList.add(444);
        linkedList.add(555);
        linkedList.add(666);
        int sum = 0;

        for (int i = 0; i < linkedList.size(); i++) {
            sum = sum + linkedList.get(i);
        }
        System.out.println("Result of sum is "+sum);
    }
}

*/