package Replit;

import java.util.HashMap;
import java.util.TreeMap;

/*
Create Map in which we want to store keys in Ascending order

Add the below values

1 item = apple

2 item = banana

3 item = pear

4 item = tomato

5 item = mango

6 item: kiwi

Extract all keys and it values and print them in the format below:

**Expected Output:**

```
Key is 1 item and values is apple
Key is 2 item and values is banana
Key is 3 item and values is pear
Key is 4 item and values is tomato
Key is 5 item and values is mango
Key is 6 item and values is kiwi
```*/
public class H1Repl202 {
    public static void main(String[] args) {

        TreeMap<String, String> grocery = new TreeMap<>();
        grocery.put("1 item", "apple");
        grocery.put("2 item", "banana");
        grocery.put("3 item", "pear");
        grocery.put("4 item", "tomato");
        grocery.put("5 item", "mango");
        grocery.put("6 item", "kiwi");

        grocery.forEach((k, v) -> System.out.println("Key is " + k + " and values is " + v));

    }

}


