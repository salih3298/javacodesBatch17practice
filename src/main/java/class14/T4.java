package class14;

public class T4 {
    private static String getVowels(String word) {
    word= word.replaceAll("[^aeiouAEIOU]","");
        return word;
    }



    public static void main(String[] args) {
       // T4 t4 = new T4();
        String word="Salih AYGUN";
     
      //  t3.getWord("Salih");

        System.out.println(getVowels(word));
    }


}
