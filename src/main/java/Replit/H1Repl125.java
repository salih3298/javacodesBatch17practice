package Replit;

/*Declare a static variable **number** that will hold an integer value:
Access **number** from the main method and assign value to it.
Create an Object of the class, access **number** in a nonstatic way and assing value of 200.
Print out **number** using class name and using instance
**Expected Output:**

200

200
 */
class H1Repl125 {
static int number;

    public static void main(String[] args) {

        number=200;
        H1Repl125 a=new H1Repl125();
        a.number=200;
        System.out.println(number);
        System.out.println(a.number);

    }
}



