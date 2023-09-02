package class9;

public class H32DArrays {
    public static void main(String[] args) {


//Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns.
// Develop a program which will identify/print the even numbers only.

//Create 2D array of countries: north america countries, south america countries, europe countries, asian countries, african countries.
// Then print all values from that array using 2 different loops and calculate how many total countries been stored.


        int[][] numbers = {
                {10, 20, 33, 21},
                {50, 155, 303,402},
                {76, 240, 290, 361}
        };



for (int row=0; row< numbers.length; row++ ) {
    for (int col=0; col<numbers[row].length; col++) {
        if (numbers[row][col]%2==0) {
            System.out.print(numbers[row][col]+" ");
                    }
    }
    System.out.println();


}

      /*  for (int row = 0; row < groceries.length; row++) {
            for (int col = 0; col < groceries[row].length; col++) { // this gives us the complete array
                System.out.print(groceries[row][col]+" ");

            }
            System.out.println();
        }*/


    }
}
