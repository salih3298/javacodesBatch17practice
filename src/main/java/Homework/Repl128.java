package Homework;

public class Repl128 {
    static String mixString (String s1, String s2) {
        String word=s1+s2;
        return word;
    }



    //test case below (dont change):
    public static void main(String[] args){
        String firstValue = mixString("12345","abcde");
        System.out.println(firstValue);
        String secondValue = mixString("howdy","hello");
        System.out.println(secondValue);

    }


}
