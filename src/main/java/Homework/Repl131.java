package Homework;

public class Repl131 {
    static String thirdLetter(String word) {
        String newWord="";
        for (int i = 0; i < word.length(); i += 3) {
            newWord = newWord + word.charAt(i);
            //  System.out.print(word);
        }
        return newWord;
    }

    //test case below (dont change):
    public static void main(String[] args) {
        System.out.println(thirdLetter("hello there")); //"hltr"
        System.out.println(thirdLetter("technology")); //"thly"
    }
}
