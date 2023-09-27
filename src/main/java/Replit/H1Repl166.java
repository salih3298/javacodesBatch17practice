package Replit;

/* Create a class Animal in which define instance variable type, constructor that will initialize instance variables and 2 methods eat and sleep.
Create a subclass Cat in which override method sleep
Create 3 Kitten subclasses of a Cat class and override method eat
for 1 kitten - eats milk
for 2 kitten - eats snack
for 3 kitten - eats everything
In main method create object of Cat class and all 3 kittens classes and store into an array of Animals. Call available methods:
**Expected Output:**

Cat eats
Cat sleeps a lot
kitten1 eats milk
kitten1 sleeps a lot
kitten2 eats snacks
kitten2 sleeps a lot
kitten3 eats everything
kitten3 sleeps a lot
*/
class H1Repl166 {
    public static void main(String[] args) {
        Cat c=new Cat();

   Animal [] animals={new Cat(), new Kitten1(), new Kitten2(), new Kitten3()};
   for (Animal a:animals) {
       a.eat();
       a.sleep();
        }
       // c.eat();
       // c.sleep();
    }



}


    class Animal{

     String type;

        Animal() {
        this.type = type;
    }

    void eat() {

    }

    void sleep() {
        System.out.println("Animals sleep");
    }

}

class Cat extends Animal {
String type="Cat";

    Cat() {
        super();
        //super(type);
    }
    void eat() {
        System.out.println(type+" eats");
    }
    void sleep() {

        System.out.println(type+" sleeps a lot");
    }


}

class Kitten1 extends Cat {
    String type="Kitten1";
    Kitten1() {
        super();
    }
    void eat() {
        System.out.println(type+" eats milk");
    }
    void sleep() {

        System.out.println(type+" sleeps a lot");
    }
}

class Kitten2 extends Cat {
    String type="Kitten2";
    Kitten2() {
        super();
    }
    void eat() {
        System.out.println(type+" eats snacks");
    }
    void sleep() {

        System.out.println(type+" sleeps a lot");
    }
}

class Kitten3 extends Cat {
    String type="Kitten3";
    Kitten3() {
        super();
    }
    void eat() {
        System.out.println(type+" eats everything");
    }
    void sleep() {

        System.out.println(type+" sleeps a lot");
    }
}

