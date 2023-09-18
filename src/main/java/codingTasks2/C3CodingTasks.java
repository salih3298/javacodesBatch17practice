package codingTasks2;

public class C3CodingTasks {
    public static void main(String[] args) {

        String str1="Madam";
        String str2="";

        for (int i = str1.length()-1; i >=0 ; i--) {
            str2=str2+str1.charAt(i);
               }
        System.out.println(str2);

       if (str1.equalsIgnoreCase(str2)) {
           System.out.println(str1+" is a Palindrome");
       } else {
           System.out.println(str1+" is not a Palindrome");
       }

    }
}
