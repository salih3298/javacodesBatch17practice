package class14;

public class T1ReverseWord {
    public static void main(String[] args) {
        String str = "This is sentence i want to reverse";
//        StringBuilder sb=new StringBuilder("This is sentence i want to reverse");
//        sb.reverse();
//        System.out.println(sb);
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];
            String reversed = reverseStr(word);
            System.out.print(reversed + " ");
        }
    }

    static String reverseStr(String inputStr) {
        String reversed = " ";
        for (int i = inputStr.length() - 1; i >= 0; i--) {
            reversed = reversed + inputStr.charAt(i);
        }
        return reversed;
    }
}


