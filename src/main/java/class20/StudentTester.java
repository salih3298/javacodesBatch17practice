package class20;

public class StudentTester {
    public static void main(String[] args) {

        Student[] arr = {new Student(),new CollegeStudent(), new SchoolStudent(), new SyntaxStudent()};

        for (int i = 0; i < arr.length; i++) {
            arr[i].speak();
            arr[i].study();
            arr[i].sleep();

        }
    }
}
