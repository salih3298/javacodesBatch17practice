package class12;

public class Palindrome {
    void stringCheck() {
        String word="salih";
        String reverse="";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);

        }
        if (reverse.equals(word)) {
            System.out.println(word+" is a Palindrome word");
        } else {
            System.out.println(word+"  is not a Palindrome word");
        }
    }

}
