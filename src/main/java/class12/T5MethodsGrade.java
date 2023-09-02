package class12;

public class T5MethodsGrade {
    //Write a method to return whether given number is prime or not?

    int getGrade(int score) {
        if (score > 90) {
            System.out.println("Your grade is A");
        } else if (score > 80) {
            System.out.println("Your grade is B");
        } else if (score > 70) {
            System.out.println("Your grade is C");
        } else if (score > 50) {
            System.out.println("Your grade is D");
        } else {
            System.out.println("Your grade is F");
        }


        return score;
    }

}
