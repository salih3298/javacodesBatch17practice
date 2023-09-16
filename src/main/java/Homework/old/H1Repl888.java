package Homework;

public class H1Repl888 {

    String breed;


    void attiributes () {
        System.out.println( breed+" can bark");
        System.out.println( breed+" can run");
        System.out.println( breed+" can play");
    }

    public static void main(String[] args) {
        H1Repl888 Husky=new H1Repl888();
        Husky.breed="Husky";
        H1Repl888 Bulldog=new H1Repl888();
        Bulldog.breed="Bulldog";
        H1Repl888 Labrador=new H1Repl888();
        Labrador.breed="Labrador";

        Husky.attiributes();
        Bulldog.attiributes();
        Labrador.attiributes();
    }

}
