package Replit;

import java.util.ArrayList;

/*
Create an array list to type String.

Add these values below to your arraylist

hi

yo

sup

yolo

boop

Remove 1, 3, 5 element from an array

print remained values one by one in one line

**Expected Output:**

```
yo yolo
```
```*/
public class H1Repl187 {
    public static void main(String[] args) {


        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("hi");
        arrayList.add("yo");
        arrayList.add("sup");
        arrayList.add("yolo");
        arrayList.add("boop");

        for (int i = 0; i < arrayList.size(); i+=2) {
            arrayList.remove(i);
            i--;
        }
        for(int i=0;i<arrayList.size();i++){
            System.out.print(arrayList.get(i)+" ");
        }

    }
}
