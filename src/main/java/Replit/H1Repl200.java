package Replit;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/*
Create A Map that will preserve an order of entry objects

Add below pairs :

"Street" = "Patrick ST"

"Suite" = "265"

"City" = "Vienna"

"Zip" = "22180"

"Country" = "United State"

Print all values of from the map using for each loop

**Expected Output:**

```
Patrick ST
265
Vienna
22180
United State
```*/
public class H1Repl200 {
    public static void main(String[] args) {

        LinkedHashMap<String, String> objects = new LinkedHashMap<>();
        objects.put("Street", "Patrick ST");
        objects.put("Suite", "265");
        objects.put("City", "Vienna");
        objects.put("Zip", "22180");
        objects.put("Country", "United State");


        System.out.println();
        objects.forEach((k, v) -> System.out.println(v));

    }

}


