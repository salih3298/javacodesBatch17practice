package class16;

public class T2 {
    private String name;
    private int age;
    private char gender;
    private double weight;


    public T2(String name){
        this.name=name;
    }
    private T2(String name, int age){
        this.name=name;
        this.age=age;
    }
     T2(String name, int age, char gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
   protected T2(String name, int age, char gender, double weight){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.weight=weight;
    }
    public void printInfo() {
        System.out.println(name+" "+ age+" "+ gender+" "+weight);
    }

    public static void main(String[] args) {
        T2 t2=new T2("Salih", 36, 'm',110);
        t2.printInfo();
    }

}
