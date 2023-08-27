package class12;

public class T1Numbers {

    public void largest(int num1, int num2) {

        if (num1 > num2) {
            System.out.println("Larger number is "+num1);
        } else {
            System.out.println("Larger number is "+num2);
        }
    }

    void evenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is even number");
        } else {
            System.out.println(num + " is odd number");
        }
    }

}

