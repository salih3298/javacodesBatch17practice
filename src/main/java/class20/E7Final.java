package class20;

public class E7Final {
    public static void main(String[] args) {
        final int AGE = 10; // for final variables uppercase is used

        System.out.println(AGE);
    }
}

final class Parent {
    final void marry() {
        System.out.println("take our permission first");
    }
}

/*class Child extends Parent {
    @Override
   /* void marry() {
        System.out.println("I want to go Holiday");
    }*/
