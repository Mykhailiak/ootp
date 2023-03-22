package labs.lab1;

public class FedexDelivery implements Delivery {
    @Override
    public void schedule() {
        System.out.println("Fedex is scheduling delivery...");
    }
}
