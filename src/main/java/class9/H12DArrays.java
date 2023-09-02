package class9;

public class H12DArrays {
    public static void main(String[] args) {

// Inside you should have an array of veggies, fruits, dairy and sweets.
// Retrieve all values from that array using 2 different loops

//Create a 2D array or integer type and store numbers in 3 rows and 3 columns. Print the sum of all numbers.

//Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns.
// Develop a program which will identify/print the even numbers only.

//Create 2D array of countries: north america countries, south america countries, europe countries, asian countries, african countries.
// Then print all values from that array using 2 different loops and calculate how many total countries been stored.


        String [][] groceries = {
                {"corn", "turnip", "lettuce", "spinach"},
                {"apricot", "fig", "banana","cucumber"},
                {"cheese", "feta", "milk", "yogurt"},
                {"candy", "ice cream", "cake", "lollipop"}
                };

        for (String [] i:groceries) {
            for (String  j:i) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();
for (int row=0; row< groceries.length; row++ ) {
    for (int col=0; col<groceries[row].length; col++) {
        System.out.print(groceries[row][col]+" ");

    } System.out.println();


}

      /*  for (int row = 0; row < groceries.length; row++) {
            for (int col = 0; col < groceries[row].length; col++) { // this gives us the complete array
                System.out.print(groceries[row][col]+" ");

            }
            System.out.println();
        }*/


    }
}
