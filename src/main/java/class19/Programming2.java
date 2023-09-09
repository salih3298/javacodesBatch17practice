package class19;

public class Programming2 {


    public Programming2() {
        System.out.println("I love programming languages");
    }

    public Programming2(String s) {

        System.out.println("I love " + s);
    }

    public static void main(String[] args) {
        Programming2 p = new Programming2("Java");
        Programming2 p2 = new Programming2();
    }
}
