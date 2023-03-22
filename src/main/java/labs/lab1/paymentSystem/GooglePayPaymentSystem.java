package labs.lab1.paymentSystem;

import labs.lab1.checkout.Checkout;
import labs.lab1.checkout.GooglePayCheckout;
import labs.lab1.paymentSystem.PaymentSystemFactory;
import labs.lab1.report.GooglePayReport;
import labs.lab1.report.Report;

public class GooglePayPaymentSystem implements PaymentSystemFactory {
    @Override
    public Checkout createCheckout() {
        return new GooglePayCheckout();
    }

    @Override
    public Report createReport() {
        return new GooglePayReport();
    }
}
