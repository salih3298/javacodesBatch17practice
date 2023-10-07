package review11;

import java.util.ArrayList;

public class E6ArrayList {
    public static void main(String[] args) {

        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Mango");
        fruit.add("Orange");
        fruit.add("Kiwi");
        fruit.add("Banana");
        fruit.add("Cherry");
        fruit.add("Apple");

        ArrayList<String> vegetables = new ArrayList<>();
        vegetables.add("Potato");
        vegetables.add("Carrot");
        vegetables.add("Cucumber");
        System.out.println(vegetables);
        vegetables.addAll(fruit);   // adding one list to another
        System.out.println(vegetables);
        vegetables.removeAll(fruit);
        System.out.println(vegetables);



    }
}
