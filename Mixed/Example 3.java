//E-commerce Checkout System
public class Order {
    private String orderId;
    private double amount;

    public String getOrderId() { return orderId; }
    public double getAmount() { return amount; }
}

public class CheckoutService {
    public void processOrder(String orderId, String userName, String address, String paymentMethod, double discount) {
        System.out.println("Processing order for: " + userName);
        System.out.println("Shipping to: " + address);

        Order order = new Order();

        double finalAmount = order.getAmount();

        if ("CreditCard".equals(paymentMethod)) {
            System.out.println("Processing payment via Credit Card");
        } else if ("PayPal".equals(paymentMethod)) {
            System.out.println("Processing payment via PayPal");
        }
    }
}
