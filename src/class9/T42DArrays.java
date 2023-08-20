package class9;

import java.util.Arrays;

public class T42DArrays {
    public static void main(String[] args) {

String [][] cars={
        {"Ford", "Cadillac", "Jeep", "Tesla"},
        {"BMW", "Audi", "Mercedes", "Volkwagen"},
        {"Kia", "Hyundai", "Sportage", "Genesis Motor"},
        {"Ferrari", "Lamborghini", "Maserati", "Fiat"} };

for (String [] array:cars) {
    for (String row:array) {
        System.out.print(row+" ");
    }
    System.out.println();
}
        System.out.println();

        System.out.print(Arrays.deepToString(cars));

    }
}
