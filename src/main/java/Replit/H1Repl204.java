package Replit;

import java.util.HashMap;
import java.util.LinkedHashMap;

/*
Create a Map that will preserve an order of entry objects

Add below pair to it .

"Street" = "Patrick ST"

"Suite" = "265"

"City" = "Vienna"

"Zip" = "22180"

"Country" = "United State"

Print all values using for each loop

**Expected output:**

```
Patrick ST
265
Vienna
22180
United State
```*/
public class H1Repl204 {
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


