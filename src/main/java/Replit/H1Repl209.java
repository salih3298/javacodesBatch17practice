package Replit;

import java.util.HashMap;
import java.util.Map;

/*
HashMap, Methods, reusability, Logic

Create a Method in Main class using below specification.

Method Name: removeValues.

Return Type: Map<String,Integer>

Parameters : Map<String,Integer>

Logic:
Method should check the values if a value is greater than
15 it should be removed from the map.

**NOW IN MAIN METHOD**

Create HashMap of String keys and Integer values

add values as below

map.put("mango", 10);

map.put("apple", 30);

map.put("orange", 20);

call above method with these arguments.
```*/
public class H1Repl209 {

 /*   public static Map<String, Integer> removeValues(Map<String, Integer> map) {

        map.forEach((k, v) -> {
            if (v > 15) {
                map.remove(k);
            }
        });
    return map;
    }

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("mango", 10);

        map.put("apple", 30);

        map.put("orange", 20);
        System.out.println(removeValues(map));
        //removeValues(map);
    }


} */

    public Map<String, Integer> removeValues(Map<String, Integer> d) {
        d.entrySet().removeIf(x -> x.getValue() > 15);
        return d;
    }

    public static void main(String[] args) {
        HashMap<String, Integer> maps = new HashMap<>();
        maps.put("mango", 10);
        maps.put("apple", 30);
        maps.put("orange", 20);

        H1Repl209 c = new H1Repl209();
        c.removeValues(maps);
        maps.entrySet().forEach(x -> System.out.println(x.getKey() +
                " : " + x.getValue()));
    }
}
