package Replit;

import java.util.HashSet;

/*
Create a set collection in which you do not want to preserve or sort the order and add below values to it.

Red

Pink

Yellow

White

Black

Print set collection

And get total number of colors available in the set

**Expected Output:**

```
Original Hash Set: [Red, Pink, White, Yellow, Black]
Size of the Hash Set: 5
```*/
public class H1Repl197 {
    public static void main(String[] args) {

        HashSet<String> h=new HashSet();
        h.add("Red");
        h.add("Pink");
        h.add("Yellow");
        h.add("White");
        h.add("Black");
        System.out.println("Original Hash Set: "+h);
        System.out.println("Size of the Hash Set: "+h.size());
    }
}

