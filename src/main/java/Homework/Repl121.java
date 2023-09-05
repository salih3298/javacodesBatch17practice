package Homework;

public class Repl121 {
    private int var1;
    private double var2;
    private char var3;

    public Repl121 (int var1, double var2, char var3){

        this.var1=var1;
        this.var2=var2;
        this.var3=var3;
    }

    void printInfo (){
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
    }
    public static void main(String[] args) {

        Repl121 t121=new Repl121(10,10.23,'a');

        t121.printInfo();

    }
}
