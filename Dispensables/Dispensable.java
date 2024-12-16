//Comments
//1
// Loop through the array and find the maximum element
for (int i = 0; i < array.length; i++) {
    if (array[i] > max) {
        max = array[i];
    }
}

//2
// This method calculates the area of a rectangle
public int calculateArea(int length, int width) {
    return length * width; // Multiply length and width
}

//Duplicate Code
//1
public void processOrder() {
    System.out.println("Processing order...");
    // Shared logic
    validateOrder();
    applyDiscount();
}

public void processReturn() {
    System.out.println("Processing return...");
    // Shared logic
    validateOrder();
    applyDiscount();
}

//2
public int calculateRectangleArea(int length, int width) {
    return length * width;
}

public int calculateSquareArea(int side) {
    return side * side;
}

//Data Class
//1
public class Customer {
    private String name;
    private String email;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}

//2
public class Point {
    private int x;
    private int y;

    public int getX() { return x; }
    public void setX(int x) { this.x = x; }

    public int getY() { return y; }
    public void setY(int y) { this.y = y; }
}

//Dead Code
public void sendEmail() {
    // Email functionality was moved to X class
}
public void calculate() {
    int result = 0; 
}

//Lazy Class
//1
public class Logger {
    public void log(String message) {
        System.out.println(message);
    }
}

//2 
public class DiscountCalculator {
    public double applyDiscount(double price) {
        return price * 0.9;
    }
}

//Speculative Generality
//1
public interface Vehicle {
    void start();
    void stop();
    void fly(); 
}

//2
public class PaymentProcessor {
    public void processCreditCard() {
        // Implementation
    }

    public void processCryptocurrency() {
        // Placeholder for future implementation
    }
}

