package Homework;

public class H1Repl83 {
    public static void main(String[] args)
    {
        int[][] a = {
                {1,1,2}, //sum = 4
                {3,1,2}, //sum = 6
                {3,5,3}, //sum = 11
                {0,1,2}  //sum = 3
        };
        int rowSum1=0;
        int rowSum2=0;
        int rowSum3=0;
        int rowSum4=0;

        for (int i=0; i<1; i++) {
            for (int j=0; j<3;j++){
                rowSum1=rowSum1+a[i][j];
            }
        }
        for (int i=1; i<2; i++) {
            for (int j=0; j<3;j++){
                rowSum2=rowSum2+a[i][j];
            }
        }
        for (int i=2; i<3; i++) {
            for (int j=0; j<3;j++){
                rowSum3=rowSum3+a[i][j];
            }
        }
        for (int i=3; i<4; i++) {
            for (int j=0; j<3;j++){
                rowSum4=rowSum4+a[i][j];
            }
        }
        System.out.println(rowSum1);
        System.out.println(rowSum2);
        System.out.println(rowSum3);
        System.out.println(rowSum4);

    }

    }

