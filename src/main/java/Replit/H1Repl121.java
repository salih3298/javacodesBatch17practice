package Replit;

/*For you to do:

declare 3 instance variables to hold an integer, double and char values.

Create 2 instances of the class and assign values to variables and the print them

**Expected Output:**

```
10
10.23
a
100
100.23
s
 */
class H1Repl121 {
    int var1;
    double var2;
    char var3;

    public static void main(String[] args) {
        H1Repl121 a = new H1Repl121();
        H1Repl121 b = new H1Repl121();
        a.var1 = 10;
        a.var2 = 10.23;
        a.var3 = 'a';
        b.var1 = 100;
        b.var2 = 100.23;
        b.var3 = 's';
        System.out.println(a.var1);
        System.out.println(a.var2);
        System.out.println(a.var3);
        System.out.println(b.var1);
        System.out.println(b.var2);
        System.out.println(b.var3);


    }
}



