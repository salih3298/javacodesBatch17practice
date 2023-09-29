package Replit;

/*Create Class EncapsulationDemo

create two variable as shown below.

private String empName=John;

private int empAge=30;

Create only getters methods for each variable.

Print the values of each variable as shown below.

**Expected Output:**

```
Employee Name: John
```

```
Employee Age: 30
 */
public class H1Repl180 {
    private String empName = "John";
    private int empAge = 30;

    public String getEmpName() {
        return empName;
    }

    public int getEmpAge() {
        return empAge;
    }
}

class MainMMM {
    public static void main(String[] args) {

        H1Repl180 e = new H1Repl180();


        System.out.println("Employee Name: " + e.getEmpName());
        System.out.println("Employee Age: " + e.getEmpAge());


    }
}


