package class11;

public class E10StringMethods {
    public static void main(String[] args) {

        /*String str = "Hi#There#how#are#you";
        String [] strs =str.split("[#]");
        System.out.println(strs.length);
        System.out.println(strs[1]);*/

        String str = "Hi There how are you";
        String [] strs =str.split("\\s");
        System.out.println(strs.length);
        System.out.println(strs[1]);


        }
    }

