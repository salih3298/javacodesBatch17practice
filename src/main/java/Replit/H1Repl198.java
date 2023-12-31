package Replit;

import java.util.HashSet;
import java.util.TreeSet;

/*
TreeSet

Create Set to store String Objects and you want them to be stored in ascending order

Please add the below values and see the result

`"India"`

`"Australia"`

`"South Africa"`

`"India"`

`"America"`

`"America"`

Print the Set.

`Expected Output:`

```
[America, Australia, India, South Africa]
```*/
public class H1Repl198 {
    public static void main(String[] args) {

        TreeSet<String> countries = new TreeSet<>();
        countries.add("India");
        countries.add("Australia");
        countries.add("South Africa");
        countries.add("India");
        countries.add("America");
        countries.add("America");
        System.out.println(countries);

    }

}


