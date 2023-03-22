package labs.lab1.delivery;

public class DhlDelivery implements Delivery {
    @Override
    public void schedule() {
        System.out.println("DHL is scheduling delivery...");
    }
}
