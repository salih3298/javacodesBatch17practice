package class4;

public class E5Temperature {
/*Create a Java program that stores the expected temperature and the actual temperature for a day.
 If the expected temperature is higher than the actual temperature,
 print "It's cooler than expected, wear a jacket!",
 otherwise print "It's as warm as expected, enjoy your day!"
 */

     public static void main(String[] args) {

        double expectedTemperature=30;
        double actualTemperature=70;


        if (expectedTemperature>actualTemperature) {
            System.out.println("It's cooler than expected, wear a jacket!");
        } else {
            System.out.println("It's as warm as expected, enjoy your day!");
        }
    }
}
