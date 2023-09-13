package class20;

public class E4PolyMor {

    public static void main(String[] args) {

        Animal[] arr = {new Cat(), new Dog(), new Animal()};
        for (int i = 0; i < arr.length; i++) {
            arr[i].eat();
            arr[i].sleep();
            arr[i].speak();
        }
        for (Animal animal : arr) {
            animal.eat();
            animal.speak();
            animal.sleep();
        }

    }
}
