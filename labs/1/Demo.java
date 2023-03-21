
public class Demo {
    private static PaymentSystem paymentSystem;
    private static Report report;

    public static void main(String[] args) {
        if (System.getenv("MARKET") == "Norway") {
            paymentSystem = new GooglePayPaymentSystem();
        } else {
            paymentSystem = new PayPalPaymentSystem();
        }

        report = paymentSystem.getReport();

        System.out.println(report.description);
        System.out.println(System.getenv("MARKET") == "Norway");
    }
}
