package clases;

/**
 * CreditCardPayment
 */
public final class CreditCardPayment extends Payment {
    private String cardNumber;

    public CreditCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    public void proccessPayment() {
        System.out.println("Connecting to bank.....");
        System.out.println("Authorizing card: " + cardNumber.substring(cardNumber.length() - 4));
        System.out.println("Credit card payment approved.");
    }

}
