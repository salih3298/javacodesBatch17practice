package Replit;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*
Create a HashMap of String.

Add below pair to it .

"Street" = "Patrick ST"

"Suite" = "265"

"City" = "Vienna"

"Zip" = "22180"

"Country" = "United State"

Print only the values in upper case using entrySet

**Expected Output:**

```
265
22180
PATRICK ST
UNITED STATE
VIENNA
```*/
public class H1Repl205 {
    public static void main(String[] args) {

        Map<String, String> objects = new HashMap<>();

        objects.put("Street", "Patrick ST");
        objects.put("Suite", "265");
        objects.put("City", "Vienna");
        objects.put("Zip", "22180");
        objects.put("Country", "United State");

        for (Map.Entry<String, String> entry : objects.entrySet()) {
            String value = entry.getValue().toUpperCase();
            System.out.println(value);
        }
    }

}


