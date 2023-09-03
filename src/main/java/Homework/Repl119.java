package Homework;

public class Repl119 {

    String censorLetter(String a, char b) {
        String str=a.replace( b, '*');
        System.out.println(str);
        return a;
    }
    public static void main(String[] args) {
        Repl119 t119=new Repl119();
        t119.censorLetter("computer science",'e');

    }
}