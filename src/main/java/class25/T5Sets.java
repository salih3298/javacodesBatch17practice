package class25;

import java.util.HashSet;
/* Create a Set that will hold Objects of Student Type.
In this set we do not care about the insertion order.
Each student object should have name and studentID.
Display name of each student.*/
public class T5Sets {
    public static void main(String[] args) {

        HashSet<String > studentName= new HashSet<>();
        HashSet<String > studentId= new HashSet<>();

        studentName.add("Salih");
        studentName.add("Ali");
        studentName.add("Adem");
        studentName.add("Mehmet");
        System.out.println(studentName);




    }

}