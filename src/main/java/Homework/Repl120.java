package Homework;

public class Repl120 {

    private int year;
    private String schoolName;
    private int batch;
    public Repl120(String schoolName, int batch, int year) {
        this.batch = batch;
        this.schoolName = schoolName;
        this.year = year;
    }
    void printInfo() {
        System.out.println("I am a student of batch "+ batch+" studying at "+schoolName+" in the year of "+year);
    }
    public static void main(String[] args) {
        Repl120 t120=new Repl120("Syntax", 9 , 2021);

        t120.printInfo();

    }
}