package Homework;

/* In Parent class.
Create a constructor, it will take a String parameter called city.
include the logic of printing the parameter value.
Create another constructor without parameter.
Include the logic of printing "Parent Constructor".
Create a Child Class that should be a subclass of Parent class
Inside child class create a constructor that will make a call to parameterized constructor of the parent class.
In Main class.
Create an Object of the child class by passing String value "Vienna"
**Expected Output:**

Vienna
*/
class H1Repl152 {
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
        H1Repl152 obj1=new H1Repl152();
        H1Repl152 obj2=new H1Repl152();
        H1Repl152 obj3=new H1Repl152();

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

