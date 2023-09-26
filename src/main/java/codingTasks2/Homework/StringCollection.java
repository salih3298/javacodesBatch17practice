package codingTasks2.Homework;

import java.util.LinkedHashSet;
import java.util.Set;

public class StringCollection {
    /*
    * Create the collection that will store single uniques Objects of a String type in which order is preserved.
Write a logic to concatenate all string from the collection.*/

    public static void main(String[] args) {
        Set<String> uniqueString = new LinkedHashSet<>();
        uniqueString.add("Hello");
        uniqueString.add("Java");
        uniqueString.add("Progaramming");
        uniqueString.add("is fun");
        uniqueString.add("Java");
       // String concatenatedString = concatenateStrings.(uniqueStrings);
      //  System.out.println(concatenatedString);
    }

}
