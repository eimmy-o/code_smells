//Large Class y Primitive Obsession 
public class Customer {
    private String name;
    private String email;
    private String phoneNumber; 
    private String address;
    private String billingAddress;
    private String shippingAddress;
    private List<Order> orders;
    private List<Payment> payments;
    private List<Review> reviews;
	
	//Long Parameter List 
	public Customer (String name , String email , String phoneNumber , 
				String address , String billingAddres , String shippingAddress ,
				List<Order> orders , List<Payment> payments , List<Review> reviews) { ... }
	
	//Long Method 
    public void processPayment(Payment payment){
		
	}
	
	public void addOrder(Order order) { ... }
    public void sendPromotionalEmail() { ... }
    public void updateAddress(String address) { ... }
	
}

public Main{
	public static void main(String[] args){
		
		//Data Clump
		public void displayCustomer(String name, String email, String phone) {
		System.out.println("Name: " + name);
		System.out.println("Email: " + email);
		System.out.println("Phone: " + phone);
		}
	}
}	


