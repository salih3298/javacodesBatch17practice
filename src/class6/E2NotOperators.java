package class6;

public class E2NotOperators {
    public static void main(String[] args) {
        String country = "UK";
        if (!country.equals("Iran")) {
            System.out.println("Welcome you are allowed");
        } else {
            System.out.println("You are not allowed");
        }
    }
}