package class19;

public class CreditCard {
    public void calInterest(double balance) {
        System.out.println(balance * 0.05);
    }
}

class Visa extends CreditCard {
}
class AX extends CreditCard {
    public void calInterest(double balance) {
        System.out.println(balance * 0.07);
    }
}
class TesterCreditCard {
    public static void main(String[] args) {
        CreditCard c = new CreditCard();
        c.calInterest(100);

        Visa v = new Visa();
        v.calInterest(100);

        AX a = new AX();
        a.calInterest(100);
    }
}
