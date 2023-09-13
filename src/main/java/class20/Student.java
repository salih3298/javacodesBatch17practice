package class20;

public class Student {

    void speak() {
        System.out.println("Students speak");
    }
    void sleep() {
        System.out.println("Students sleep");
    }
    void study() {
        System.out.println("Students study");
    }
}
class SyntaxStudent extends Student {

    void study(){
        System.out.println("Students study JAVA!");
    }
}
class CollegeStudent extends Student {

    void speak () {
        System.out.println("College students speak foreign lang");
    }
}
class SchoolStudent extends Student {

    void study () {
        System.out.println("Students study lessons");
    }
}
