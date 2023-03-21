public class PayPalPaymentSystem extends PaymentSystem {
    public Report getReport() {
        return new Report("PayPal payment report");
    }
}
