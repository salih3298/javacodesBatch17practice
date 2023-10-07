package review11;

import java.util.ArrayList;

public class E5ArrayList {
    public static void main(String[] args) {

        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Mango");
        fruit.add("Orange");
        fruit.add("Kiwi");
        fruit.add("Banana");
        fruit.add("Cherry");
        fruit.add("Apple");

        fruit.set(2, "Grapes"); // Its gonna replace elements at index 2
        System.out.println(fruit);
        fruit.isEmpty();

        System.out.println(fruit.indexOf("Apple"));
        System.out.println(fruit.lastIndexOf("Apple"));


    }
}
