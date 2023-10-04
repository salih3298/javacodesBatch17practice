package Replit;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/*
Create a Set and and below values to it.

[third, first, second]

Print HashSet and then remove all the elements from Hashset and print it again.

**Expected Output:**

```
[third, first, second]
[]
```*/
public class H1Repl196 {
    public static void main(String[] args) {

        HashSet<String> h=new HashSet();
        h.add("third");
        h.add("first");
        h.add("second");
        System.out.println(h);
        h.clear();

        System.out.println(h);

    }
}

