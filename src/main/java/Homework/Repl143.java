package Homework;

public class Repl143 {

    String make;
    String model;
    int numberOfDoors;
    int topSpeed;
    double price;

    Repl143 (String make, String model, int numberOfDoors, int topSpeed, double price) {
        this.make =make;
        this.model =model;
        this.numberOfDoors = numberOfDoors;
        this.topSpeed =topSpeed;
        this.price =price;
    }
    Repl143 (String make, String model, int topSpeed, double price) {
        this.make =make;
        this.model =model;
        this.numberOfDoors = 4;
        this.topSpeed =topSpeed;
        this.price =price;
    }
    Repl143 ( int numberOfDoors, int topSpeed, double price) {
        this.make ="unknown";
        this.model ="unknown";
        this.numberOfDoors = numberOfDoors;
        this.topSpeed =topSpeed;
        this.price =price;
    }
    Repl143 (String make, String model, int numberOfDoors) {
        this.make =make;
        this.model =model;
        this.numberOfDoors = numberOfDoors;
        this.topSpeed =90;
        this.price =0.00;
    }

    void display() {
        System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
    }
}

class Main143 {


}
