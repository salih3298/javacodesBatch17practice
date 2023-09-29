package Replit;

/*C Encapsulation

Create Class EncapsulationDemo that will have 2 variables empName and empAge;
Create the getter/setter methods for each variable.
In Main Class and main method
Using setter methods assign the values as "Mario" and "32"
Using getter methods print the values as below outputs.
 **Expected Output:**
```
Employee Name: Mario
Employee Age: 32
 */
class H1Repl179 {
    private String empName;
    private int empAge;

    String getEmpName() {
        return empName;
    }
    int getEmpAge() {
        return empAge;
    }

    void setEmpName(String empName) {
        this.empName = empName;
    }

    void setEmpAge(int empAge) {
        this.empAge = empAge;
    }
}

class MainMM {
    public static void main(String[] args) {

        H1Repl179 e = new H1Repl179();
        e.setEmpAge(32);
        e.setEmpName("Mario");

        System.out.println("Employee Name: " + e.getEmpName());
        System.out.println("Employee Age: " + e.getEmpAge());


    }
}


