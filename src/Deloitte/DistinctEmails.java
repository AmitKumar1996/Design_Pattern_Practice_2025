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

        @Override
        public String toString() {
            return "User{" + "email1='" + email1 + '\'' + ", email2='" + email2 + '\'' + '}';
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

        // 1. Extract and collect distinct email IDs
        List<String> distinctEmails = userList.stream()
            .flatMap(user -> Stream.of(user.getEmail1(), user.getEmail2()))
            .distinct()
            .collect(Collectors.toList());
        System.out.println("Distinct Emails: " + distinctEmails);

        // 2. Count how many times each email appears
        Map<String, Long> emailFrequency = userList.stream()
            .flatMap(user -> Stream.of(user.getEmail1(), user.getEmail2()))
            .collect(Collectors.groupingBy(email -> email, Collectors.counting()));
        System.out.println("Email Frequency: " + emailFrequency);

        // 3. Filter users who have a specific email (e.g., "D@gmail.com")
        List<User> usersWithEmailD = userList.stream()
            .filter(user -> "D@gmail.com".equals(user.getEmail1()) || "D@gmail.com".equals(user.getEmail2()))
            .collect(Collectors.toList());
        System.out.println("Users with 'D@gmail.com': " + usersWithEmailD);

        // 4. Convert all email IDs to lowercase and get distinct set
        List<String> lowerCaseDistinctEmails = userList.stream()
            .flatMap(user -> Stream.of(user.getEmail1(), user.getEmail2()))
            .map(String::toLowerCase)
            .distinct()
            .collect(Collectors.toList());
        System.out.println("Lowercase Distinct Emails: " + lowerCaseDistinctEmails);

        // 5. Group users by first email
        Map<String, List<User>> usersGroupedByEmail1 = userList.stream()
            .collect(Collectors.groupingBy(User::getEmail1));
        System.out.println("Grouped by email1: " + usersGroupedByEmail1);

        // 6. Get all emails ending with “gmail.com”
        List<String> gmailEmails = userList.stream()
            .flatMap(user -> Stream.of(user.getEmail1(), user.getEmail2()))
            .filter(email -> email.endsWith("gmail.com"))
            .distinct()
            .collect(Collectors.toList());
        System.out.println("Gmail Emails: " + gmailEmails);
    }
} 