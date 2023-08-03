package class5;

import java.util.Scanner;

public class H5CityTemperature {
    public static void main(String[] args) {

        System.out.println("What is your city");
        Scanner input1 = new Scanner(System.in);
        String city= input1.next();
        System.out.println("What is the temperature");
        Scanner input2 = new Scanner(System.in);
        float temperature= input2.nextFloat();
        System.out.println("Is temperature celcius (C) or (F) Please write only C/F");
        Scanner input3 = new Scanner(System.in);
        char celciusFahrenheit= input3.next().charAt(0);

        if (celciusFahrenheit=='C') {
            System.out.println("The temperature is the "+city+" is "+temperature+" C");
        } else {
            System.out.println("The temperature is the "+city+" is "+(temperature*32/180)+" C");
        }
    }
}