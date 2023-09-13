package class20;

public class E3TypeCasting {
    public static void main(String[] args) {
        StudentFirst s1 = new StudentFirst("Aslan", "A123");
        StudentFirst s2 = new StudentFirst("Salih", "3298");
        // Student [] arr={s1,s2};
        StudentFirst[] arr = {new StudentFirst("Aslan", "A123"), new StudentFirst("Salih", "3298")}; // yukarıdaki ile aynı şeyi ifade ediyor

        // arr[1].printInfo();
        // s2.printInfo();

        for (int i = 0; i < arr.length; i++) {
            StudentFirst s = arr[i];
            s.printInfo();

        }

        int num = (int) 12.5;
        System.out.println(num);
        double age = 10;

        Animal a = new Dog();
        Dog d = (Dog) new Animal();

    }
}
