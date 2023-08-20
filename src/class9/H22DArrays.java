package class9;

public class H22DArrays {
    public static void main(String[] args) {

//Create a 2D array or integer type and store numbers in 3 rows and 3 columns. Print the sum of all numbers.

//Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns.
// Develop a program which will identify/print the even numbers only.

//Create 2D array of countries: north america countries, south america countries, europe countries, asian countries, african countries.
// Then print all values from that array using 2 different loops and calculate how many total countries been stored.


        int[][] numbers = {
                {10, 20, 30, 40},
                {100, 200, 303,},
                {100, 250, 303, 500}
        };
int sum=0;


for (int row=0; row< numbers.length; row++ ) {
    for (int col=0; col<numbers[row].length; col++) {
        sum=sum+numbers[row][col];

    }


}System.out.println(sum);

      /*  for (int row = 0; row < groceries.length; row++) {
            for (int col = 0; col < groceries[row].length; col++) { // this gives us the complete array
                System.out.print(groceries[row][col]+" ");

            }
            System.out.println();
        }*/


    }
}
