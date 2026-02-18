package adapterparttern.practice;


public class Adapter implements Payment{

    public final RielCurrencyPayment rielCurrencyPayment;
    public Adapter(RielCurrencyPayment rielCurrencyPayment){
        this.rielCurrencyPayment = rielCurrencyPayment;
    }

    @Override
    public boolean pay(double cash) {
        if (rielCurrencyPayment==null){
            throw new RuntimeException("RielCurrencyPayment is null");
        }
        double riel = cash * 4000;
        rielCurrencyPayment.payAsRiel(riel);
        System.out.println("Paid successfully: " + cash + " riel");

        return true;
    }
}
