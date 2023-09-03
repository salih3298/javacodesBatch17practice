package class16;

public class PersonTester {
    public static void main(String[] args) {
        Person p1 = new Person("Salih", 36,
                115, 'M');
        p1.printInfo();

        Person p2 = new Person();
        p2.printInfo();


    }
}
