package class5;

public class T1NestedIfEseTask {
    public static void main(String[] args) {
        boolean diploma = false;
        double gpaScore = 4.0;

        if (diploma == true) {
            System.out.println("Congratulations");
            if (gpaScore > 3.5) {
                System.out.println("You are eligible for scholarship");
            } else {
                System.out.println("You should have studied harder");
            }
        } else {
        System.out.println("You should get a degree");
            }
        }
    }