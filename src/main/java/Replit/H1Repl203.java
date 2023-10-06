package Replit;

import java.util.HashMap;
import java.util.TreeMap;

/*
Create HashMap

add values as below

map.put("mango", 10);

map.put("apple", 30);

map.put("orange", 20);

map.put("mango", 40);

 map.put("mango", 40);

retrieve all keys and values in the format below: using for each

**Expected Output:**

```
Key = orange and value = 20
Key = apple and value = 30
Key = mango and value = 40
```*/
public class H1Repl203 {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("mango", 10);
        map.put("apple", 30);
        map.put("orange", 20);
        map.put("mango", 40);
        map.put("mango", 40);


        map.forEach((k, v) -> System.out.println("Key = " + k + " and value = " + v));

    }

}


