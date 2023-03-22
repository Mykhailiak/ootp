package labs.lab1.paymentSystem;

import labs.lab1.checkout.Checkout;
import labs.lab1.checkout.PayPalCheckout;
import labs.lab1.report.PayPalReport;
import labs.lab1.report.Report;

public class PayPalPaymentSystem implements PaymentSystemFactory {
    @Override
    public Checkout createCheckout() {
        return new PayPalCheckout();
    }

    @Override
    public Report createReport() {
        return new PayPalReport();
    }
}
