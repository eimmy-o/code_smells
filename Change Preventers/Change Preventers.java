//Divergent Change
//1
public class Report {
    public void generatePDFReport() {
        // Logic for generating PDF
    }

    public void generateExcelReport() {
        // Logic for generating Excel
    }

    public void sendReportByEmail() {
        // Logic for sending report by email
    }

    public void saveReportToDatabase() {
        // Logic for saving report
    }
}

//2
public class Employee {
    public void calculateSalary() {
        // Salary calculation logic
    }

    public void generateIDCard() {
        // ID card generation logic
    }

    public void updateContactDetails(String email, String phone) {
        // Update contact details logic
    }
}

//Parallel Inheritance Hierarchies
//1
public abstract class Animal {
    public abstract void makeSound();
}

public class Dog extends Animal {
    @Override
    public void makeSound() { System.out.println("Woof!"); }
}

public class Cat extends Animal {
    @Override
    public void makeSound() { System.out.println("Meow!"); }
}

// Parallel hierarchy for food
public abstract class AnimalFood {
    public abstract void prepare();
}

public class DogFood extends AnimalFood {
    @Override
    public void prepare() { System.out.println("Preparing dog food."); }
}

public class CatFood extends AnimalFood {
    @Override
    public void prepare() { System.out.println("Preparing cat food."); }
}

//2
public abstract class Vehicle {
    public abstract void start();
}

public class Car extends Vehicle {
    @Override
    public void start() { System.out.println("Starting car."); }
}

public class Bike extends Vehicle {
    @Override
    public void start() { System.out.println("Starting bike."); }
}

// Parallel hierarchy for fuel types
public abstract class Fuel {
    public abstract void refuel();
}

public class CarFuel extends Fuel {
    @Override
    public void refuel() { System.out.println("Refueling car."); }
}

public class BikeFuel extends Fuel {
    @Override
    public void refuel() { System.out.println("Refueling bike."); }
}

//Shotgun Surgery
//1
public class Customer {
    private String name;
    private String email;

    public void updateEmail(String newEmail) {
        this.email = newEmail;
        NotificationService.notifyEmailChange(this);
        AuditService.logEmailChange(this);
    }
}

public class NotificationService {
    public static void notifyEmailChange(Customer customer) {
        // Notify email change logic
    }
}

public class AuditService {
    public static void logEmailChange(Customer customer) {
        // Log email change logic
    }
}

//2
public class Order {
    private String status;

    public void updateStatus(String newStatus) {
        this.status = newStatus;
        OrderLogger.logStatusChange(this);
        EmailNotifier.sendStatusUpdate(this);
        DatabaseUpdater.updateOrderStatus(this);
    }
}

public class OrderLogger {
    public static void logStatusChange(Order order) {
        // Logging logic
    }
}

public class EmailNotifier {
    public static void sendStatusUpdate(Order order) {
        // Email notification logic
    }
}

public class DatabaseUpdater {
    public static void updateOrderStatus(Order order) {
        // Database update logic
    }
}
