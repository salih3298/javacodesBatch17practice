package Replit;

/* Create a Parent Class in which you will have 1 implemented method m2 and 1 unimplemented method m1
Make Main class to be a derived class from Parent.
In main method execute both methods
**Expected Output:**
Child class providing implementation
Parent class providing implementation
**Expected Output:**

Vienna
*/
abstract class H1Repl172 {


    public abstract void m1();

    public void m2() {
        System.out.println("Parent class providing implementation");
    }

}
    class Child extends H1Repl172 {

        public void m1() {
            System.out.println("Child class providing implementation");
        }


        public static void main(String[] args) {


            Child c = new Child();
            c.m1();
            c.m2();


        }
    }



