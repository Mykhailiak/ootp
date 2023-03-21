abstract public class PaymentSystem {
    public void checkout() {
        System.out.println("Checking out the customer");
    }

    abstract public Report getReport();
}
