package class26;

import java.util.TreeMap;

public class T2 {
    /*
Create a map of countries(5) with its capital that will store countries in alphabetical order. Country names will be keys and capitals will be values
Only print those countries which contain more than 5 letters in their country
name and the letter 'a' in their capital names
 */
    public static void main(String[] args) {

        TreeMap<String, String> countries = new TreeMap<>();
        countries.put("Türkiye", "Ankara");
        countries.put("USA", "Washington");
        countries.put("Germany", "Berlin");
        countries.put("France", "Paris");
        countries.put("Spain", "Madrid");

        System.out.println(countries);
        System.out.println("************");

        countries.forEach((k, v) -> {
            if (k.length() > 5 && v.contains("a")) {
                System.out.println(k + " " + v);
            }
        });
        countries.forEach((k, v) -> System.out.println(v));
    }
}
