package Replit;

/*Declare 3 instance variables to hold:
year, school name and batch #
Access variables from the main method and assign specific values to them
Print values of your variables in the following format:
**Expected Output:**
```
I am a student of batch 9 studying at Syntax in the year of 2021
 */
class H1Repl120 {
    private static int year;
    private static String schoolName;
    private static String batch;

    public static void main(String[] args) {
        year = 2021;
        schoolName = "Syntax";
        batch = "batch 9";

        System.out.println("I am a student of " + batch + " studying at " + schoolName + " in the year of " + year);


    }
}



