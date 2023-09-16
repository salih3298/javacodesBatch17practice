package Homework;

public class Repl170 {

        /* For you to do:

Overload 2 final instance methods:

Call them in main method

**Expected Output:**

```
Final method with boolean parameter
Final method with String parameter */

    final void met1(String word1) {
        System.out.println(word1);
        }
    final void met2(String word2) {
        System.out.println(word2);
    }

    public static void main(String[] args) {
        Repl170 t1701=new Repl170();
        Repl170 t1702=new Repl170();

        t1701.met1("Final method with boolean parameter");
        t1702.met2("Final method with String parameter");
    }
}
