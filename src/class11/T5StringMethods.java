package class11;

public class T5StringMethods {
    public static void main(String[] args) {

      String str="ASDFGHJKLŞqwertyuıop!'^+%&/()=?";
      System.out.println(str.replaceAll("[^A-Za-z ]","").length());
    }
}




