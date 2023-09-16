package Homework;

public class H1Repl82 {
    public static void main(String[] args) {
       int sum = 0;

        int[][] a = {
                {-5,-2,-3,7},
                {1,-5,-2, 2},
                {1,-2, 3,-4}
        };

    for (int row=0; row<a.length; row++) {
        for (int col=0; col<a[row].length; col++){
            sum=sum+a[row][col];}
    }
        System.out.println(sum);

        }

    }

