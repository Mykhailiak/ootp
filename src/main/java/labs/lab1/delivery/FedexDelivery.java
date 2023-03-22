package labs.lab1.delivery;

public class FedexDelivery implements Delivery {
    @Override
    public void schedule() {
        System.out.println("Fedex is scheduling delivery...");
    }
}
