package Homework;

/* Create a Class Main

In this class, you should specify the following attributes: breed, name, color, and following behaviors: bark(), run(), play().

Create 3 different objects of it: Husky, Bulldog, Labrador with specific attributes and behaviors.
The output of the program should be as following:
Husky can bark
Husky can run
Husky can play
Bulldog can bark
Bulldog can run
Bulldog can play
Labrador can bark
Labrador can run
Labrador can play

*/
class H1Repl88 {
    String breed;
    String name;
    String color;

    void bark(){
        System.out.println(breed+" can bark");
    }
    void run(){
        System.out.println(breed+" can run");
    }
    void play() {
        System.out.println(breed+" can play");
    }

    public static void main(String[] args) {
        H1Repl88 obj1=new H1Repl88();
        H1Repl88 obj2=new H1Repl88();
        H1Repl88 obj3=new H1Repl88();

        obj1.breed="Husky";
        obj2.breed="Bulldog";
        obj3.breed="Labrador";

        obj1.bark();
        obj1.run();
        obj1.play();
        obj2.bark();
        obj2.run();
        obj2.play();
        obj3.bark();
        obj3.run();
        obj3.play();
    }

}

