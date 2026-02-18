package adapterparttern.practice;

import java.util.PrimitiveIterator;

public class BankingPayment implements Payment{

    private Account account;
    public BankingPayment(Account account){
        this.account = account;
    }

    @Override
    public boolean pay(double cash) {
        if (account == null) {
            throw new RuntimeException("Account is null please check the account Object");
        }
        double totalCash = account.getBalance();
        double newBalance = totalCash - cash;
        account.setBalance(newBalance);
        System.out.println("Paid successfully " + cash + " $");

        return true;
    }
}
