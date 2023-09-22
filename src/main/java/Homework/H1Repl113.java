package Homework;

/* Step1: Create a method that will accept with 2 parameters of integer type

Step2: Write the logic in that method in println statement to print hours and minutes

Step3: Call the method
Expected Output:**

```
11:30
 */

class H1Repl113 {
    public void clock(int a, int b) {
        System.out.println(a + ":" + b);

    }

    public static void main(String[] args) {
        H1Repl113 a = new H1Repl113();
        a.clock(11, 30);
    }


}



