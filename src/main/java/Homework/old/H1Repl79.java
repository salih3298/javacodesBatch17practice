package Homework;

public class H1Repl79 {
    public static void main(String[] args) {
        double[][] a = {
                {1.4, 2.0, 3.3, 2},
                {4, 1.5, 6.1, 1},
                {1.2, 3.1, 4, 1.6}
        };

     /*   for(double [] row:a) {
            for (double  col:row) {

                System.out.print((a[row][col]));
            }*/
        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                System.out.print(a[row][col]+" ");
            }
            System.out.println();
        }

        }

    }

