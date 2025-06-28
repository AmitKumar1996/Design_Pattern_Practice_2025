package Deloitte;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DistinctEmails {

    // User class with two email fields
    static class User {
        private String email1;
        private String email2;

        public User(String email1, String email2) {
            this.email1 = email1;
            this.email2 = email2;
        }

        public String getEmail1() {
            return email1;
        }

        public String getEmail2() {
            return email2;
        }
    }

    public static void main(String[] args) {
        // Sample list of users
        List<User> userList = Arrays.asList(
            new User("A@gmail.com", "B@gmail.com"),
            new User("C@gmail.com", "D@gmail.com"),
            new User("A@gmail.com", "D@gmail.com"),
            new User("A@gmail.com", "D@gmail.com")
        );

        // Extract and collect distinct email IDs
        List<String> distinctEmails = userList.stream()
            .flatMap(user -> Stream.of(user.getEmail1(), user.getEmail2()))
            .distinct()
            .collect(Collectors.toList());

        // Print result
        System.out.println("Distinct Emails: " + distinctEmails);
    }
}
