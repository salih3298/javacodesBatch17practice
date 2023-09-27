package Replit;

/*For you to do:
Declare 3 instance variables to hold:
- name of the country
- capital
- population size
Create a method to display values of instance variables
Create 2 Object, assign values to instance variables, execute method display;
**Expected Output:**
The capital of USA is Washington DC and population is 330000000
The capital of Kazakhstan is Astana and population is 18500000
 */
class H1Repl122 {
    String countryName;
    String capital;
    long population;

    public void method() {
        System.out.println("The capital of " + countryName + " is " + capital + " and population is " + population);
    }

    public static void main(String[] args) {
        H1Repl122 a = new H1Repl122();
        H1Repl122 b = new H1Repl122();
        a.countryName = "USA";
        a.capital = "Washington DC";
        a.population = 330000000;
        b.countryName = "Kazakhstan";
        b.capital = "Astana";
        b.population = 18500000;

        a.method();
        b.method();

    }
}



