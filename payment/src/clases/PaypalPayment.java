package clases;


/**
 * PaypalPayment
 */
public final class PaypalPayment extends Payment {
    private String email;

    public PaypalPayment(double amount, String email) {
        super(amount);
        this.email = email;
    }

    @Override
    public void proccessPayment() {
        System.out.println("Connecting to Paypal.............");
        System.out.println("Account: " + email);
        System.out.println("Paypal payment completed.");
    }

}
