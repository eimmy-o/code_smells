//Feature Envy
//1
public class Customer {
    private String address;

    public String getAddress() {
        return address;
    }
}

public class Order {
    private Customer customer;

    public String getCustomerAddress() {
        return customer.getAddress(); 
    }
}

//2
public class Employee {
    private Department department;

    public double getDepartmentBudget() {
        return department.getBudget(); 
    }
}

public class Department {
    private double budget;

    public double getBudget() {
        return budget;
    }
}

//Inappropriate Intimacy
//1
public class Husband {
    private Wife wife;

    public void manageWifeTasks() {
        wife.doLaundry(); 
        wife.cookDinner();
    }
}

public class Wife {
    public void doLaundry() {
        // Laundry logic
    }

    public void cookDinner() {
        // Cooking logic
    }
}

//2
public class BankAccount {
    private double balance;

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

public class ATM {
    private BankAccount account;

    public void processTransaction() {
        if (account.getBalance() > 100) {
            account.withdraw(100); 
        }
    }
}

//Incomplete Library Class
//1
// Library class
public class MathLibrary {
    public double sqrt(double number) {
        // Implementation
        return Math.sqrt(number);
    }
}

// User code
public class ExtendedMath {
    private MathLibrary mathLibrary;

    public double calculateCubeRoot(double number) {
        // Workaround due to missing cube root function
        return Math.pow(number, 1.0 / 3.0);
    }
}

//2
// Library class
public class DateLibrary {
    public String getCurrentDate() {
        return "2024-12-01"; // Simplistic implementation
    }
}

// User code
public class DateFormatter {
    public String getFormattedDate() {
        DateLibrary library = new DateLibrary();
        // Workaround for missing formatting in library
        return "Date: " + library.getCurrentDate();
    }
}

//Message Chains
//1
public class Person {
    private Address address;

    public Address getAddress() {
        return address;
    }
}

public class Address {
    private String city;

    public String getCity() {
        return city;
    }
}

public static void main(String[] args){
	Person person = new Person();
	String city = person.getAddress().getCity(); 
}

//2
public class Car {
    private Engine engine;

    public Engine getEngine() {
        return engine;
    }
}

public class Engine {
    private Cylinder cylinder;

    public Cylinder getCylinder() {
        return cylinder;
    }
}

public class Cylinder {
    private int numberOfCylinders;

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }
}

public static void main(String[] args){
	Car car = new Car();
	int cylinders = car.getEngine().getCylinder().getNumberOfCylinders(); 
} 

//Middle Man
//1
public class Manager {
    private Worker worker;

    public void performTask() {
        worker.performTask(); 
    }
}

public class Worker {
    public void performTask() {
        // Task logic
    }
}

//2
public class FrontDesk {
    private Receptionist receptionist;

    public void bookRoom(String roomType) {
        receptionist.bookRoom(roomType); 
    }
}

public class Receptionist {
    public void bookRoom(String roomType) {
        // Booking logic
    }
}
