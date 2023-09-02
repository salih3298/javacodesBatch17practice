package class6;


public class E5OrOperators {
    public static void main(String[] args) {

        boolean broughtFLower=false;
        boolean broughtChocolates=false;
        boolean allMyMistake=false;

        if (broughtChocolates || broughtFLower || allMyMistake) {
            System.out.println("Wife is happy");
        } else {
            System.out.println("Wife is sad");
        }

    }
}