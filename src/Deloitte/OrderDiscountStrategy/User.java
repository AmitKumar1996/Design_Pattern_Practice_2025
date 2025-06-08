package Deloitte.OrderDiscountStrategy;
import java.util.function.Predicate;

class User {
    String username;
    String password;

    User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void login(Predicate<User> validator) {
        if (validator.test(this)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid credentials.");
        }
    }
}


