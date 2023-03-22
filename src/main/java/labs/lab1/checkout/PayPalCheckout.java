package labs.lab1.checkout;

import labs.lab1.checkout.Checkout;

public class PayPalCheckout implements Checkout {
    public void execute() {
        System.out.println("PayPal checkout execution...");
    }
}
