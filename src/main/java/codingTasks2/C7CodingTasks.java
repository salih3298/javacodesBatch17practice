package codingTasks2;

import java.util.ArrayList;

public class C7CodingTasks {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();

        words.add("Apple");
        words.add("Banana");
        words.add("Grape");
        words.add("Action");
        words.add("Audi");
        words.add("Computer");

        for (int i = 0; i < words.size(); i++) {
            if (!words.get(i).startsWith("A")) {
                words.remove(i);
                i--;
            }
            //  System.out.println(words.get(i).toLowerCase());
        }
        for (int i = 0; i < words.size(); i++) {
            System.out.println(words.get(i).toLowerCase());
        }
        //System.out.println(words.get().toLowerCase());
    }
}
