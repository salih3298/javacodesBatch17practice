package Replit;

/*C# Encapsulation
Create Class EncapsulationDemo
create two variable as shown below.
private String empName;
private int empAge;
Create the getter/setter methods for each variable.
In Main Class and main method.
Using setter methods assign the values as "John" and "30"
Using getter methods print the values as below outputs.
**Expected Output:**
```
Employee Name: John
Employee Age: 30
 */
class H1Repl178 {
    private String empName;
    private int empAge;

    public String getEmpName(){
        return empName;
    }

    public int getEmpAge(){
        return empAge;
    }

    void setEmpName(String empName) {
        this.empName=empName;
    }

    void setEmpAge(int empAge) {
        this.empAge=empAge;
    }
}

class MainM{
    public static void main(String[] args) {

        H1Repl178 e=new H1Repl178();
        e.setEmpAge(30);
        e.setEmpName("John");

        System.out.println("Employee Name: "+e.getEmpName());
        System.out.println("Employee Age: "+e.getEmpAge());


    }
}


