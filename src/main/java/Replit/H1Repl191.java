package Replit;

import java.util.ArrayList;

/*
Create an ArrayList of type boolean called listA and add below values
(true, false, false)
Create another array list call listB and ad all values from List A into it
Print all values from ListB 1 by 1 using loop
**Expected Output:**

true
false
false
```*/
public class H1Repl191 {
    public static void main(String[] args) {

        ArrayList<Boolean> listA = new ArrayList<>();
        listA.add(true);
        listA.add(false);
        listA.add(false);
        ArrayList<Boolean> listB = new ArrayList<>();
        for (int i = 0; i < listA.size(); i++) {
            listB.add(listA.get(i));
            System.out.println(listB.get(i));
        }



    }

}



