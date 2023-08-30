package class12;

public class T5MethodsHello {
    //Write a method to return whether given number is prime or not?

    String hello(String country) {
        if (country.equals("USA")) {
            System.out.println("Hello friend");
        } else if (country.equals("UK")) {
            System.out.println("Hello friend");
        } else if (country.equals("Turkey")) {
            System.out.println("Merhaba Arkadaş");
        } else if (country.equals("India")) {
            System.out.println("हेलो दोस्त");
        } else if (country.equals("Brazil")) {
            System.out.println("Olá amigo");
        } else if (country.equals("Mexico")) {
            System.out.println("Hola amigo/amiga");
        } else if (country.equals("France")) {
            System.out.println("Bonjour mon ami");
        } else {
            System.out.println("Country not included");
        }
        return country;
    }

}
