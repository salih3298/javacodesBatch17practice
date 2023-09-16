package Homework;

public class Repl123 {
    private int var1;
    private String var2;
    private double var3;
    private boolean var4;
    private float var5;

    Repl123 (int var1, double var3, boolean var4, float var5) {

        this.var1=var1;
        this.var3=var3;
        this.var4=var4;
        this.var5=var5;
    }

    void printInfo() {
       //for (int i = 1; i <=5; i++) {
            System.out.println(var1);
            System.out.println(var2);
            System.out.println(var3);
            System.out.println(var4);
            System.out.println(var5);


        }

        public static void main(String[] args) {
            Repl123 t123=new Repl123(0,0.0,false,0.0f);
            t123.printInfo();



        }
}
