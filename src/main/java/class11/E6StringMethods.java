package class11;

public class E6StringMethods {
    public static void main(String[] args) {

        String str = "kjdfnoHJKcg  +% &/( )/*-+65453&/()=SDYUGH";
        System.out.println(str.replaceAll("[A-Z]","*"));
        System.out.println(str.replaceAll("[A-E]","*"));
        System.out.println(str.replaceAll("[A-K]","*"));
        System.out.println(str.replaceAll("[a-z]","*"));
        System.out.println(str.replaceAll("[0-9]","="));
        System.out.println(str.replaceAll("[0-9]",""));
        System.out.println(str.replaceAll("[A-z]","/"));

    }
}
