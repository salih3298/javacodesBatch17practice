package review6;

public class E4StringMethods {
  /*  public static void main(String[] args) {
        String str="This is a java class";
        char[] arr=str.toCharArray();
        for(char ch:arr){
            System.out.print(ch);
        }

    }*/

    public static void main(String[] args) {

        String word ="abrakadabra";

        String replace=word.replaceAll("[^aAeEiIoOuU]", "");

        System.out.println(replace);

    }
    }

