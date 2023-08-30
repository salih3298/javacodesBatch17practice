package class13;

public class SyntaxEmployee {

    static String CEO = "Sumair";
    int salary;
    String empID;

    public static void main(String[] args) {
        SyntaxEmployee asghar = new SyntaxEmployee();
        asghar.empID = "I123";
        asghar.salary = 20;
        SyntaxEmployee moazzam = new SyntaxEmployee();
        moazzam.empID = "I456";
        moazzam.salary = 95;

        System.out.println(moazzam.salary);
        System.out.println(SyntaxEmployee.CEO);
        System.out.println(moazzam.CEO);
        System.out.println(asghar.CEO);


    }


}


