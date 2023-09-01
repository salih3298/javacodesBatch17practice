package Homework;

public class H1Repl87 {

    String carColor;
    String carMake;
    int carYear;

    void attiributes () {
        System.out.println( "Car color is "+carColor+" and car year is "+carYear+" and car model is "+carMake);
    }

    public static void main(String[] args) {
        H1Repl87 BMW=new H1Repl87();
        BMW.carMake="BMW";
        BMW.carYear=2019;
        BMW.carColor="Black";
        BMW.attiributes();
        H1Repl87 Toyota=new H1Repl87();
        Toyota.carMake="Toyota";
        Toyota.carYear=2018;
        Toyota.carColor="White";

        Toyota.attiributes();
    }

}
