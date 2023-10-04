package Replit;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/*
Create the HashSet with list of Integers add the below numbers for the list

111

111

111

999

999

999



Print elements one by one.

**Expected Output**

```
999
111
```*/
public class H1Repl195 {
    public static void main(String[] args) {

        HashSet<Integer> hashSet=new HashSet<>();
        hashSet.add(111);
        hashSet.add(111);
        hashSet.add(111);
        hashSet.add(999);
        hashSet.add(999);
        hashSet.add(999);

        hashSet.forEach(x-> System.out.println(x));

        for(Integer h:hashSet){
            System.out.println(h);
        }


        }

    }


