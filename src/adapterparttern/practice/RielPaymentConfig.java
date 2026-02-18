package adapterparttern.practice;

public class RielPaymentConfig implements RielCurrencyPayment{
    private final Account account;
    public RielPaymentConfig(Account account){
        this.account = account;
    }

    @Override
    public boolean payAsRiel(double riel) {
        double dollar = riel / 4000;
        double totalCashDollar = account.getBalance();
        double newUpdateBalance = totalCashDollar-dollar;
        account.setBalance(newUpdateBalance);
        System.out.println("Paid " + riel +" riel");

        return true;
    }
}
