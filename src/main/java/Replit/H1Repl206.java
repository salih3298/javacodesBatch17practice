package Replit;

import java.util.HashMap;
import java.util.Map;

/*
Hash Map

Create a Hash Map of String pairs

add the follow values

map.put("ONE","AAA");

map.put("TWO","BBB");

map.put("THREE","CCC");

map.put("FOUR","DDD");

map.put("FIVE","EEE");

Print key and values pairs using for each loop

Remove below from Map

"ONE"

"FOUR"

after removal print again

**Expected Output:**

```
HashMap Before Remove :
FIVE : EEE
ONE : AAA
FOUR : DDD
TWO : BBB
THREE : CCC
------------------
HashMap After Remove :
FIVE : EEE
TWO : BBB
THREE : CCC
```*/
public class H1Repl206 {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

        map.put("ONE", "AAA");

        map.put("TWO", "BBB");

        map.put("THREE", "CCC");

        map.put("FOUR", "DDD");

        map.put("FIVE", "EEE");
        System.out.println("HashMap Before Remove :");
       map.forEach((k,v)-> System.out.println(k+" : "+v));
       map.remove("ONE");
       map.remove("FOUR");
        System.out.println("*****");
        System.out.println("HashMap After Remove :");
        map.forEach((k,v)-> System.out.println(k+" : "+v));
    }

}


