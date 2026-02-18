package adapterparttern;

public class App {
    public static void main(String[] args) {
        int cents = 10000;
        PaymentProcessor creditPayment = new CreditPayment();
        creditPayment.pay(cents);

        PayPalPayment payPalPayment = new PayPalPayment();
        PaymentProcessor paymentAdapter = new PaymentAdapter(payPalPayment);
        paymentAdapter.pay(cents);


    }
}
