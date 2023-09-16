package Homework;

public class Repl137 {

    private String name;
    public String city;
    protected String nameOfTheSchool;
    int batchNumber;

    void printInfo(String name, String city, String nameOfTheSchool, int batchNumber) {
        System.out.println("My name is "+name+" and I live in "+city+" . I study at "+nameOfTheSchool+" in batch "+batchNumber);
    }

    public static void main(String[] args) {
        Repl137 m=new Repl137();
        m.printInfo("John","Miami","Syntax",9);

    }
}
