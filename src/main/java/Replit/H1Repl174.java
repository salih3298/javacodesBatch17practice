package Replit;

/* Create an Interface with name as MyInterface

Create two undefined methods method1 and method2

Inherit the MyInterface to Main Class.

Execute both methods

**Expected Output:**

```
implementation of method1
```

```
implementation of method2
*/
public interface H1Repl174 {

    void method1();


    void method2();

}

class MyMain implements H1Repl174 {
    @Override
    public void method1() {
        System.out.println("implementation of method1");
    }

    @Override
    public void method2() {
        System.out.println("implementation of method2");
    }
    public static void main(String[] args) {
        MyMain m=new MyMain();
        m.method1();
        m.method2();


    }
}

