package Homework;

public class Repl148 {

    private String item;
    private double price;
    private int quantity;

    Repl148 (String item, double price, int quantity) {
        this.item=item;
        this.price=price;
        this.quantity=quantity;
    }
    void itemTotalPrice() {
        System.out.println(item+" Total Value "+(price*quantity));
    }



    public static void main(String[] args) {
        Repl148 t148=new Repl148("Blanket", 33.3, 3);
        t148.itemTotalPrice();
    }
}
