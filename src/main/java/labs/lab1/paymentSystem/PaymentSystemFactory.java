package labs.lab1.paymentSystem;

import labs.lab1.checkout.Checkout;
import labs.lab1.report.Report;

public interface PaymentSystemFactory {
    public Checkout createCheckout();
    public Report createReport();
}