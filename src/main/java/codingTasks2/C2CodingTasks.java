package codingTasks2;

public class C2CodingTasks {
    public static void main(String[] args) {

        String str = "Hello";
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);

        }
        System.out.println(reverse);


    }
}