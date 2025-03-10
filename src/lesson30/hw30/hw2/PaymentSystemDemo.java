package lesson30.hw30.hw2;

public class PaymentSystemDemo {
    public static void main(String[] args) {

        ElectronicWallet electronicWallet = new ElectronicWallet(1000, "евро");
        BankAccount bankAccount = new BankAccount(1500,"евро");

        electronicWallet.checkBalance();
        electronicWallet.withdrawMoney(300);
        electronicWallet.checkBalance();
        electronicWallet.depositTransfer(200);
        electronicWallet.checkBalance();

        System.out.println("\n===========================\n");

        bankAccount.checkBalance();
        bankAccount.withdrawMoney(240);
        bankAccount.checkBalance();
        bankAccount.depositTransfer(329);
        bankAccount.checkBalance();


    }
}
