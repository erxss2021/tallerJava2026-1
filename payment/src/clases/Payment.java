package clases;

import java.time.LocalDate;

public abstract sealed class Payment permits CreditCardPayment, PaypalPayment, CashPayment{
    protected double amount;
    protected LocalDate paymentDate;

    public Payment(double amount) {
        if (amount <= 0) {
            System.out.println("Amount must be greater than zero.");
        }else{
            this.amount = amount;
            this.paymentDate = LocalDate.now();
        }
    }

    public abstract void proccessPayment();

    public double getAmount() {
        return amount;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void showPaymentInformation(){
        System.out.println("----------------------------");
        System.out.println("Payment Type:  " + getClass().getSimpleName());
        System.out.println("Amount      : $" + amount);
        System.out.println("Date        :  " + paymentDate);
    }

    
}
