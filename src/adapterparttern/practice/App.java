package adapterparttern.practice;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        double dollar = 5000;
        Account account = new Account(
                1,dollar,10234, LocalDate.now(),"kimm"
        );
        Payment dollarPayment = new BankingPayment(account);
        dollarPayment.pay(40);

        RielCurrencyPayment rielCurrencyPayment = new RielPaymentConfig(account);
        Payment paymentAdapter = new Adapter(rielCurrencyPayment);
        paymentAdapter.pay(10);
        System.out.println(account.getBalance()+ " $");

    }
}
