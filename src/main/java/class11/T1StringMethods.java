package class11;

public class T1StringMethods {
    public static void main(String[] args) {

        String name = "SalihAYGN";

        if (!name.isEmpty() && name.length() % 2 != 0 && name.length() >= 3) {
            System.out.println(name.charAt(name.length() / 2));
        }


    }
}
