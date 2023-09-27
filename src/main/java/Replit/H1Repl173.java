package Replit;

/* Abstraction
Create a Super Class Tea that will have:
- instance variable teaType;
- constructor that will initialize
- unimplemented method addSugar(),
Create 2 subclasses of Tea as Lemon Tea and Chai Tea.
In main class create an object of 2 Child and assign them to Parent reference type.
Execute method addSugar from both classes.
**Expected Output:**
For Lemon Tea we need 2 spoons of sugar
For Chai Tea we need 1 spoon of sugar
*/
abstract class H1Repl173 {
    String teaType;

    public H1Repl173(String teaType) {
        this.teaType = teaType;
    }

    abstract void addSugar();


}

class Lemon extends H1Repl173 {


    public Lemon(String teaType) {
        super(teaType);
    }

    @Override
    void addSugar() {
        System.out.println("For "+teaType+" we need 2 spoons of sugar");
    }
}

class ChaiTea extends H1Repl173 {


    public ChaiTea(String teaType) {
        super(teaType);

    }

    @Override
    void addSugar() {
        System.out.println("For "+teaType+" we need 1 spoons of sugar");

    }
}

class MainMain {
    public static void main(String[] args) {

        Lemon l = new Lemon("Lemon");
        ChaiTea c = new ChaiTea("Chai Tea");
        l.addSugar();
        c.addSugar();
    }
}