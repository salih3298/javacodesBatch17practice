package class19;

public class T3 {
    private void print() {
        System.out.println("Form 1");
    }

    private void print(String word) {
        System.out.println("Form 2");
    }

    private void print(int num1) {
        System.out.println("Form " + num1);
    }

    public static void main(String[] args) {
        T3 t = new T3();
        t.print();
    }
}
