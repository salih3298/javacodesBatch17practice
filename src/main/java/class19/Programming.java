package class19;

public class Programming {
    String pass(String word) {
        String word1 = "I love programming languages";
        String word2 = "I love ";

        if (word == "") {
            return word1;
        } else {
            return word2 + word;
        }
    }
}
