package codingTasks2;

import codingTasks1.C10CodingTasks;

public class C10CodingTasksMarks {

    private double mark1;
    private double mark2;
    private double mark3;
    private double mark4;

    public C10CodingTasksMarks(double mark1, double mark2, double mark3) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        System.out.println((mark1 + mark2 + mark3) / 3);
    }

    public C10CodingTasksMarks(double mark1, double mark2, double mark3, double mark4) {
        this(mark1,mark2,mark3);
        this.mark4=mark4;
        System.out.println((mark1 + mark2 + mark3+mark4) / 4);
    }

    class A extends C10CodingTasks {
        //public A(9);

    }

    public static void main(String[] args) {


    }
}
