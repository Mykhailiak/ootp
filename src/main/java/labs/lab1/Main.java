package labs.lab1;

import labs.lab1.checkout.Checkout;
import labs.lab1.delivery.Delivery;
import labs.lab1.delivery.DhlDelivery;
import labs.lab1.delivery.FedexDelivery;
import labs.lab1.paymentSystem.GooglePayPaymentSystem;
import labs.lab1.paymentSystem.PayPalPaymentSystem;
import labs.lab1.paymentSystem.PaymentSystemFactory;
import labs.lab1.report.Report;

public class Main {
    public static PaymentSystemFactory getPaymentSystemFactory() {
        if (System.getenv("MARKET") == "Norway") {
            return new GooglePayPaymentSystem();
        }

        return new PayPalPaymentSystem();
    }

    public static Delivery getDeliveryMethod() {
        if (System.getenv("MARKET") == "Norway") {
            return new DhlDelivery();
        }

        return new FedexDelivery();
    }

    public static void main(String[] args) {
        PaymentSystemFactory paymentSystemFactory = getPaymentSystemFactory();
        Delivery delivery = getDeliveryMethod();
        Report report = paymentSystemFactory.createReport();
        Checkout checkout = paymentSystemFactory.createCheckout();

        checkout.execute();
        delivery.schedule();
        report.renew();
    }
}
