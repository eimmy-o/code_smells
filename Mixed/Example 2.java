//User Registration System
public class User {
    private String name;
    private String email;
    private String password;

    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPassword() { return password; }
}

public class UserValidator {
    public boolean validateEmail(String email) {
        return email.contains("@");
    }
}

public class RegistrationService {
    private UserValidator validator = new UserValidator();
	
    public boolean registerUser(User user) {
        if (!validator.validateEmail(user.getEmail())) {
            System.out.println("Invalid email address");
            return false;
        }
		
        if (user.getName() == null || user.getName().isEmpty()) {
            System.out.println("Invalid name");
            return false;
        }

        System.out.println("User registered successfully");
        return true;
    }

    public boolean registerAdmin(User admin) {
        if (!validator.validateEmail(admin.getEmail())) {
            System.out.println("Invalid email address");
            return false;
        }

        if (admin.getName() == null || admin.getName().isEmpty()) {
            System.out.println("Invalid name");
            return false;
        }

        System.out.println("Admin registered successfully");
        return true;
    }
}
