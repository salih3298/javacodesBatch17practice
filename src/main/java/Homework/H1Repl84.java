package Homework;

public class H1Repl84 {
    public static void main(String[] args) {
       int sum = 0;


        int[][] a = {
                {-5,-2,-3,7},
                {1,-5,-2,2},
                {1,-2,3,-4}
        };

        for (int row=0; row<a.length; row++) {
            for (int col=0; col<a[row].length; col++){
                if (a[row][col]<0 && a[row][col]%2!=0)  {
                    sum++;
                }
                }
        }
        System.out.println(sum);

        }

        }


