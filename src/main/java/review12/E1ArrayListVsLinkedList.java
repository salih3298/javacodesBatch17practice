package review12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class E1ArrayListVsLinkedList {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Jamel");
        names.add("Deepali");
        names.add("Ali");
        names.add("John");
        names.add("Adam");
        names.add(3, "Salih");
      //  names.remove(2);
        System.out.println(names);

        List<String> names2 = new LinkedList<>();
        names2.add("Jamel");
        names2.add("Deepali");
        names2.add("Ali");
        names2.add("John");
        names2.add("Adam");
        names2.add(3, "Salih");
        System.out.println(names2);
    }
}
