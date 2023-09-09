package Homework;

public class Repl124 {
    static String ss = "Welcome To Syntax Technologies";

    void printInfo() {
        System.out.println(ss);
    }


    public static void main(String[] args) {
        System.out.println(ss);  //By calling directly

        System.out.println(Repl124.ss);  //By using the className

        Repl124 t124 = new Repl124();  // By creating the object of the class
        System.out.println(t124.ss);

    }
}
