package clases;


/**
 * CashPayment
 */
public final class CashPayment extends Payment {

    public CashPayment(double amount) {
        super(amount);
    }

    @Override
    public void proccessPayment() {
        System.out.println("Receiving cash.....");
        System.out.println("Cash payment received.");
    }

}
