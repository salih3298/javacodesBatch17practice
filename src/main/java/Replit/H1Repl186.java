package Replit;

import java.util.ArrayList;

/*
# ArrayList Remove

Create an Arraylist of type Integer.

Add below elements to it.

111

222

333

444

555

666

Print the ArrayList.

remove all the elements.

Print the Arraylist.



**Expected Output:**

```
[111, 222, 333, 444, 555, 666]
[]
```
```*/
public class H1Repl186 {
    public static void main(String[] args) {


        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(111);
        arrayList.add(222);
        arrayList.add(333);
        arrayList.add(444);
        arrayList.add(555);
        arrayList.add(666);

        System.out.println(arrayList);


        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.remove(i);
            i--;

        }
        System.out.println(arrayList);

    }
}
