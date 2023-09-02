package class5;

public class E1NestedIfStatements
{
    public static void main(String[] args) {
        boolean winter=true;
        String jacketColor ="Black";

        if (winter==true) {
            System.out.println("It is very cold");
            if  (jacketColor.equals("Red")) {
                System.out.println("Lets go with Nike shoes");
            } else {
                System.out.println("Lets go with blue ones"); }
        } else {
            System.out.println("No need to wear jackets");
        }
    }
}
