package lesson30.hw30.hw2;

public class ElectronicWallet implements PaymentSystem {

    private double balance;
    private String currency;

    public ElectronicWallet(double balance, String currency) {
        this.balance = balance;
        this.currency = currency;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public void withdrawMoney(double amount) {
        if (amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Снято: " + amount + " " + currency);
        } else {
            System.out.println("Недостаточно денег на счету");
        }
    }

    @Override
    public void depositTransfer(double amount) {
        if (amount > 0){
            balance += amount;
            System.out.println("Зачислено: " + amount + " " + currency);
        }

    }

    @Override
    public double checkBalance() {
        System.out.println("На Вашем счету: " + balance + " " + currency);
        return balance;
    }
}
