package Homework;

/*Create a variable that will hold the count of all instances of the Main class

Create 3 Object of the class and print value of the count variable;
Expected Output:**

```
3
 */
class H1Repl126 {
static int count;

    public static void main(String[] args) {
        H1Repl126 a=new H1Repl126();
        count ++;
        H1Repl126 b=new H1Repl126();
        count ++;
        H1Repl126 c=new H1Repl126();
        count ++;
        System.out.println(count);

    }
}



