package Replit;

import java.util.HashMap;

/*
Create Hash Map.

add the follow values

map.put("ONE","AAA");

map.put("TWO","BBB");

map.put("THREE","CCC");

map.put("FOUR","DDD");

map.put("FIVE","EEE");

print keys and values using for each loop

replace with below key THREE--> ASEL and key FIVE-->SUMAIR

print keys and values using for each loop

OUTPUT



```
HashMap Before Replace :
FIVE : EEE
ONE : AAA
FOUR : DDD
TWO : BBB
THREE : CCC
------------------
HashMap After Replace :
FIVE : SUMAIR
ONE : AAA
FOUR : DDD
TWO : BBB
THREE : ASEL

```
```*/
public class H1Repl207 {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

        map.put("ONE","AAA");

        map.put("TWO","BBB");

        map.put("THREE","CCC");

        map.put("FOUR","DDD");

        map.put("FIVE","EEE");
        System.out.println("HashMap Before Replace :");
       map.forEach((k,v)-> System.out.println(k+" : "+v));
       map.replace("FIVE","SUMAIR");
       map.replace("THREE","ASEL");

        System.out.println("------------------");
        System.out.println("HashMap After Replace :");
        map.forEach((k,v)-> System.out.println(k+" : "+v));
    }

}


