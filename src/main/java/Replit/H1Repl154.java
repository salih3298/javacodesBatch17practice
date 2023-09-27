package Replit;

/* In Parent Class.
Create a no-argument constructor and include the logic to print "Parent Constructor without argument"
Create another constructor that takes one parameter of integer type called number.
include the logic to print the value of the number.
In Child class.
Create a Constructor without parameter and include the logic to print "Child Constructor without argument"
Overload the constructor by adding one parameter of type integer
Inside the constructor call the parameterized parent class constructor.
In Main Class.
Create an object of Child without passing any argument.
And then another object of Child class by passing the value "10". run the application.
**Expected Output:**
Parent Constructor without argument
Child Constructor without argument

10
*/
class Parent {
    int number;
    Parent(){
        System.out.println("Parent Constructor without argument");
    }
    Parent(int number){
        this.number=number;
        System.out.println(number);
    }

    static class Child extends Parent{
        public Child(){

            System.out.println("Child Constructor without argument");
        }
        public Child(int number){
            super(number);

        }
    }

}
class H1Repl154 {
    public static void main(String[] args) {

        Parent.Child c1=new Parent.Child();
        Parent.Child c2=new Parent.Child(10);


        //Parent.Child c1=new Parent.Child();
        //Parent.Child c2=new Child(10);


    }
}