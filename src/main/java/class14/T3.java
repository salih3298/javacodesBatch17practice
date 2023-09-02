package class14;

public class T3 {
    public static String getWord(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) {
        T3 t3 = new T3();

      //  t3.getWord("Salih");

        System.out.println(t3.getWord("Salih"));
    }
}
