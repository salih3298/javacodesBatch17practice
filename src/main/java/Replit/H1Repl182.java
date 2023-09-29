package Replit;

public class H1Repl182 {
    /* Encapsulation
Create the a Person class with the following:
**Class Variables**
- firstname
- lastname
- birthmonth
- birthday
- birthyear
- String ssn
**Constructor**
The main constructor should take in all values and assign them to their respective private class variables
**Methods**
Create a public getters to access all the variables.
**Create a public method called formatBirthday, which will return a String composed of their birthday in mm/dd/yyyy format.  For example, if birthmonth=3, birthday=22, birthyear=2000, it should return the String "3/22/2000"**
in Main Class.
Instantiate and object of Person and provide values. follows below outputs for values.
using getter and method print them separately.
**Note: Read carefully the steps.**
**Expected Output:**

John
```
Doe
```
10/25/1900
`
123-45-6789 */

    private String firstname;
    private String lastname;
    private int birthmonth;
    private int birthday;
    private int birthyear;
    private String ssn;

    public H1Repl182(String firstname, String lastname, int birthmonth, int birthday, int birthyear, String ssn) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthmonth = birthmonth;
        this.birthday = birthday;
        this.birthyear = birthyear;
        this.ssn = ssn;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getBirthmonth() {
        return birthmonth;
    }

    public int getBirthday() {
        return birthday;
    }

    public int getBirthyear() {
        return birthyear;
    }

    public String getSsn() {
        return ssn;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setBirthmonth(int birthmonth) {
        this.birthmonth = birthmonth;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public void setBirthyear(int birthyear) {
        this.birthyear = birthyear;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public void formatBirthday() {
        System.out.println(birthmonth + "/" + birthday + "/" + birthyear);
    }
}

class MaIn{
    public static void main(String[] args) {

        H1Repl182 f=new H1Repl182("John","Doe",10,25,1900,"123-45-6789");


        System.out.println(f.getFirstname());
        System.out.println(f.getLastname());
        f.formatBirthday();
        System.out.println(f.getSsn());


    }
}