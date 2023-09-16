package Homework;

public class Repl168 {

        /* For you to do:

Create an instance final method that will reverse a String and return that new String

Call method from the main method

**Expected Output:**

```
olleh */

    final String met(String word) {
        String reverse = "";
        for (int i = word.length()-1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }
        return reverse;
    }

    public static void main(String[] args) {
        Repl168 t168=new Repl168();

        System.out.println( t168.met("hello"));
    }
}
