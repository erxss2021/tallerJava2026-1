package test;

import clases.CashPayment;
import clases.CreditCardPayment;
import clases.Employee;
import clases.Payment;
import clases.PaypalPayment;

public class Test {
    public static void main(String[] args) {
        // Payment[] payments2 = new Payment[5];

        CreditCardPayment cardPayment = new CreditCardPayment(1500, "123456789324323");
        Payment[] payments = {
            cardPayment,    
            new PaypalPayment(950, "salmoran@gmail.com"),
            new CashPayment(500),
            new CreditCardPayment(3500, "9343211543")
        };

        for (Payment payment : payments) {
            payment.showPaymentInformation();
            payment.proccessPayment();
            System.out.println();
        }
    }
}
