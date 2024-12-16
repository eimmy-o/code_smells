//Alternative Classes with Different Interfaces
//1
public class Square {
    public double getArea(double side) {
        return side * side;
    }
}

public class Circle {
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
}

//2
public class XMLExporter {
    public void exportToXML(String data) {
        System.out.println("Exporting data to XML: " + data);
    }
}

public class JSONExporter {
    public String toJSON(String data) {
        return "{\"data\": \"" + data + "\"}";
    }
}

//Refused Bequest
//1
public class Animal {
    public void eat() { System.out.println("Eating..."); }
    public void walk() { System.out.println("Walking..."); }
}

public class Fish extends Animal {
    @Override
    public void walk() {
        throw new UnsupportedOperationException("Fish cannot walk!");
    }
}

//2
public class Employee {
    public void work() { System.out.println("Working..."); }
    public void attendMeeting() { System.out.println("Attending a meeting..."); }
}

public class Intern extends Employee {
    @Override
    public void attendMeeting() {
        throw new UnsupportedOperationException("Interns don't attend meetings.");
    }
}

//Switch Statements
//1
public double calculateDiscount(String customerType) {
    switch (customerType) {
        case "REGULAR":
            return 5.0;
        case "PREMIUM":
            return 10.0;
        case "VIP":
            return 20.0;
        default:
            return 0.0;
    }
}

//2
public String getShapeDescription(String shape) {
    switch (shape) {
        case "CIRCLE":
            return "A round shape.";
        case "SQUARE":
            return "A shape with four equal sides.";
        case "TRIANGLE":
            return "A shape with three sides.";
        default:
            return "Unknown shape.";
    }
}

//Temporary Field
//1
public class Order {
    private double discount;

    public void applyDiscount(Customer customer) {
        if (customer.isPremium()) {
            discount = 10.0;
        }
        System.out.println("Discount applied: " + discount);
        discount = 0; // Resetting the temporary field
    }
}

//2
public class ReportGenerator {
    private String currentReportType;

    public void generate(String reportType) {
        currentReportType = reportType;
        System.out.println("Generating " + currentReportType + " report...");
        currentReportType = null; // Reset temporary field
    }
}
