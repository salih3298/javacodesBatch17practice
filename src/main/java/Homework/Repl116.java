package Homework;

public class Repl116 {

    int bothEven(int num1, int num2) {
        if (num1%2==0 && num2%2==0) {
            System.out.println(true);
        } else  {
            System.out.println(false);
        }
        return num1;
        }


    public static void main (String[]args){
        Repl116 t116=new Repl116();
        t116.bothEven(4,6);

    }
}