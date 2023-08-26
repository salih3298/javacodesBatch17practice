package class10;

public class Car {
    String model;
    String make;
    int year;
    double price;
    String type;

    void photo (){
        System.out.println("my car is best");
    }
    void battery (){
        System.out.println("low fuel cons");
    }
    public static void main(String[] args) {

    Car honda=new Car();
        honda.model="14 Pro max";
        honda.make="civic";
        honda.year=2020;
        honda.price=5000;
        honda.type="sedan";

        Car toyota=new Car();
        toyota.model="14 Pro max";
        toyota.make="civic";
        toyota.year=2020;
        toyota.price=5000;
        toyota.type="sedan";

        Car mercedes=new Car();
        mercedes.model="14 Pro max";
        mercedes.make="civic";
        mercedes.year=2020;
        mercedes.price=5000;
        mercedes.type="suv";

        System.out.println(mercedes.model);
        System.out.println(toyota.price);
        System.out.println(honda.year);
        System.out.println(mercedes.type);


    }
}
