package Replit;

import java.util.LinkedHashSet;
import java.util.TreeSet;

/*
Create a Set collection in which you want to preserve an order of inserted String Objects.

Add the below values

- null
- Sohil
- Diego
- Alijon
- Asel
- Sumair



Print values 1 by 1 using loop and foreach loop

```
null
Sohil
Diego
Alijon
Asel
Sumair
null
Sohil
Diego
Alijon
Asel
Sumair
```*/
public class H1Repl199 {
    public static void main(String[] args) {

        LinkedHashSet<String> linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add("null");
        linkedHashSet.add("Sohil");
        linkedHashSet.add("Diego");
        linkedHashSet.add("Alijon");
        linkedHashSet.add("Asel");
        linkedHashSet.add("Sumair");

        for (String l:linkedHashSet) {
            System.out.println(l);
        }

        linkedHashSet.forEach(x-> System.out.println(x));


    }

}


