//Inventory Management System
public class Product {
    private String name;
    private double price;
    private String supplierName;
    private String supplierContact;

    public String getSupplierName() { return supplierName; }
    public String getSupplierContact() { return supplierContact; }
    public double getPrice() { return price; }
    public String getName() { return name; }
}

public class Inventory {
    private List<Product> products;

    public void calculateInventoryValueAndContactSuppliers() {
        double totalValue = 0.0;

        for (Product product : products) {
            totalValue += product.getPrice();
            System.out.println("Product: " + product.getName() + ", Price: " + product.getPrice());
            System.out.println("Contacting supplier: " + product.getSupplierName());
            System.out.println("Supplier contact: " + product.getSupplierContact());
        }

        System.out.println("Total inventory value: " + totalValue);

        if (totalValue > 10000) {
            System.out.println("Notify the manager: Inventory value exceeds the threshold.");
        }
    }
}
