package class19;

public class T2 {
    public static void print(){
        System.out.println("Java is great");
    }
    public static void print(String word){
        System.out.println("Java is "+word);
    }

    public static void main(String[] args) {
        T2.print("Amazing");
        T2.print();
    }
}
