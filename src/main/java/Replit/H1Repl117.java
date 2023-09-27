package Replit;

/* Create a method with the following specs:
Returns:
an integer
Name:
sumEvenToX
Parameters:
an integer called "x"
Purpose:
calculate the sum of the EVEN integers from 1 to x (including x)
Examples:
sumEvenToX(5) ==> 6
sumEvenToX(8) ==> 20
 */
class H1Repl117 {
    public static int sumEvenToX(int x) {
        int sum = 0;
        for (int i = 2; i <= x; i += 2) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        System.out.println(sumEvenToX(8));

    }


}



