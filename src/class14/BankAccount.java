package class14;

public class BankAccount {
    private String name="Fahim";
    private String userName="Fahim123";
    private String password="pass123";
    private double accountBalance=-300;
    private  String accountNumber="12345";

    private void printInfo() {
        System.out.println("I am Salih from batch 17");
    }
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        System.out.println(bankAccount.name);
    }


}
