package class11;

public class E7StringMethods {
    public static void main(String[] args) {

        String str = "kjdfnoHJKcg  +% &/( )/*-+65453&/()=SDYUGH";
        System.out.println(str.replaceAll("[A-Z]","*"));
        System.out.println(str.replaceAll("[A-E]","*"));
        System.out.println(str.replaceAll("[A-K]","*"));
        System.out.println(str.replaceAll("[a-z]","*"));
        System.out.println(str.replaceAll("[0-9]","="));
        System.out.println(str.replaceAll("[0-9]",""));
        System.out.println(str.replaceAll("[&-;]","/"));
        System.out.println(str.replaceAll("[A-Z0-9]",""));
        System.out.println(str.replaceAll("[A-Z0-58-9a-j]",""));
        System.out.println(str.replaceAll("[kjnc64]",""));

        String str1="asdfgh QWER 123456 ()!@#$%^";
        System.out.println(str1.replaceAll("[A-Z]", "="));  //removes uppercase letters
        System.out.println(str1.replaceAll("[0-9]", ""));  //removes numbers 0-9
        System.out.println(str1.replaceAll(" ", "")); //removes spaces from code
        System.out.println(str1.replaceAll("[&-;]", ""));  //removes lines from askii tables
        System.out.println(str1.replaceAll("[A-Z0-5a-j]", "")); //can remove uppercase A-Z,0-5,a-j
        System.out.println(str1.replaceAll("[ks2s]", "")); //removes specific characters also
        System.out.println(str1.replaceAll("[^A-Z]", "")); //removes specific characters also
        System.out.println(str1.replaceAll("[^A-Za-z0-9]", "")); //removes specific characters also
        System.out.println(str1.replaceAll("[^Q]", "")); //removes specific characters also

    }
}
