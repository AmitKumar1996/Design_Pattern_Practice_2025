package Deloitte.OrderDiscountStrategy;

import java.util.function.Predicate;

public class AuthExample {
    public static void main(String[] args) {
        User user = new User("amit", "password123");

        // Basic validation
        Predicate<User> validate = u -> "amit".equals(u.username) && "password123".equals(u.password);

        user.login(validate);  // Login successful!
    }
}
