package class10;

public class DogTester {
    public static void main(String[] args) {
// creating an object from the dog class
        Dog lunasObj=new Dog();
        lunasObj.name="Luna";
        lunasObj.gender='F';
        lunasObj.breed="Shiba";
        lunasObj.weight=10;
        lunasObj.age=20;
        System.out.println(lunasObj.name);
        System.out.println(lunasObj.age);
        System.out.println(lunasObj.breed);

        lunasObj.bark();
        lunasObj.eat();
        lunasObj.sleep();

    }
}
