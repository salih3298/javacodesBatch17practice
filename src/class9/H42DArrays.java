package class9;

public class H42DArrays {
    public static void main(String[] args) {



//Create 2D array of countries: north america countries, south america countries, europe countries, asian countries, african countries.
// Then print all values from that array using 2 different loops and calculate how many total countries been stored.


        String [][] countries = {
                {"USA", "Canada", "Mexico", "Bahamas"},
                {"Brazil", "Argentina", "Uruguay", "Bolivia"},
                {"Germany", "UK", "France", "Russia"},
                {"China", "Korea", "Japan", "Thailand"},
                {"Sudan", "Eritrea", "Somalia", "Niger"}
                };
        int sum1=0;
        int sum2=0;
        for (String[] row:countries) {
            for (String col:row) {

                System.out.print(col+" ");
                sum1++;
            } System.out.println();
        } System.out.println(sum1+" countries been stored!");
        System.out.println();

        for (String [] i:countries) {
            for (String  j:i) {
                System.out.print(j+" ");
                sum2++;
            }   System.out.println();

        }System.out.println(sum2+" countries been stored!");




    }


}





