package class23;

public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount b= new BankAccount("Marta", 1234, 23432434, "User939", "pass123", "checking" );
        System.out.println(b.getName());
        System.out.println(b.getBankAccountNumber());
        b.setName("Shawn");
        System.out.println(b.getName());
    }
}
