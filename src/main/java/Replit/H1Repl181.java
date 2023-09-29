package Replit;

/*Encapsulation
Create Class Account
Create the below variables:
- acc_no;
- name;
- email;
- double amount;
Create the getter/setter methods for each variable.
In Main Class and the main method.
Using setter methods assign the values as:
acc_no = 7560504000
name = Sumair
email = sumair@syntax.com
amount = 50000.0
Using getter methods print the values as below output.
**Expected Output:**

7560504000 Sumair sumair@syntax.com 50000.0
 */
public class H1Repl181 {
    private long acc_no;
    private String name;
    private String email;
    private double amount;

    public long getAcc_no() {
        return acc_no;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getAmount() {
        return amount;
    }

    public void setAcc_no(long acc_no) {
        this.acc_no = acc_no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}

class MainMMMM {
    public static void main(String[] args) {

        H1Repl181 c = new H1Repl181();

        c.setAcc_no(7560504000L);
        c.setName("Sumair");
        c.setEmail("sumair@syntax.com");
        c.setAmount(50000.0);

        System.out.println(c.getAcc_no()+" "+c.getName()+" "+c.getEmail()+" "+c.getAmount());


    }
}


