package codingTasks2;

public class C1CodingTasks {
    public static void main(String[] args) {

        String var1="apple";
        String var2="banana";

        var1=var1.concat(var2);
        var2=var1.substring(0,5);

        var1=var1.substring(5,11);
        System.out.println("new var1 = "+var1);

        System.out.println("new var2 = "+var2);

    }
}
