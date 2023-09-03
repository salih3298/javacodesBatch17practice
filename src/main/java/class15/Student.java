package class15;

public class Student {

    private String name;
    private double grade1;
    private double grade2;
    private double grade3;

    public Student(String sName, double sGrade1, double sGrade2, double sGrade3) {

        name = sName;
        grade1 = sGrade1;
        grade2 = sGrade2;
        grade3 = sGrade3;
       // System.out.println(" The average grade is " + (sGrade1 + sGrade2 + sGrade3) / 3);
    }

    public void calc() {
        double avg = 0;
       avg=(grade1 + grade2 + grade3) / 3;
       System.out.println(" The average grade is " + avg);
    }

    public static void main(String[] args) {


        Student s1 = new Student("Salih", 85.7, 90, 90.9);
        Student s2 = new Student("Ali", 50, 90.4, 70.9);

        s1.calc();
        s2.calc();

    }
}
