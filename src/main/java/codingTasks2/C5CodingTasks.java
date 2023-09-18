package codingTasks2;

import java.util.Arrays;

public class C5CodingTasks {
    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silent";

        char[] chr1 = str1.toCharArray();
        char[] chr2 = str2.toCharArray();

        //System.out.println(chr2[1]);

        Arrays.sort(chr1);
        Arrays.sort(chr2);

        // Arrays.equals(chr1,chr2);

        if (Arrays.equals(chr1, chr2)) {
            System.out.println("Words are anagram");
        } else {
            System.out.println("Words are not anagram");
        }

    }
}
