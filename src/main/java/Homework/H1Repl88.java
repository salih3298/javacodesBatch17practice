package Homework;

public class H1Repl88 {

    String breed;


    void attiributes () {
        System.out.println( breed+" can bark");
        System.out.println( breed+" can run");
        System.out.println( breed+" can play");
    }

    public static void main(String[] args) {
        H1Repl88 Husky=new H1Repl88();
        Husky.breed="Husky";
        H1Repl88 Bulldog=new H1Repl88();
        Bulldog.breed="Bulldog";
        H1Repl88 Labrador=new H1Repl88();
        Labrador.breed="Labrador";

        Husky.attiributes();
        Bulldog.attiributes();
        Labrador.attiributes();
    }

}
