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

   public static Map<String,Integer> removeValues(Map<String,Integer> map) {

       //if ("kjh",5);
        return map;
    }
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("mango", 10);

        map.put("apple", 30);

        map.put("orange", 20);

        removeValues(map);
    }


}


