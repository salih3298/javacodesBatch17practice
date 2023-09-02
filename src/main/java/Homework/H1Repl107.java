package Homework;

public class H1Repl107 {
    public static void main(String[] args) {
        StringBuffer word = new StringBuffer("Hello Friends");
        String newWord=word.toString();
        for (int i=newWord.length()-1; i>=0; i--) {
            System.out.print(newWord.charAt(i));
        }

    }
}
