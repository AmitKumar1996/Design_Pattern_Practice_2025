package Deloitte;

import java.util.*;

/*
 Question 1: Least Active Users (Shopping Website)

 Problem Statement:
 Design a system to track user logins and return users with the fewest logins in the last 24 hours.
 Must handle high-volume streams (thousands per minute).

 Approach:
 - Queue<Event>: Stores login events in order (timestamp, username).
 - Map<String, Integer>: Tracks login counts per user.
 - TreeMap<Integer, Set<String>>: For O(1) retrieval of users with the least logins.

 Key Operations:
 - newUserLogin(username): Update all structures.
 - getLeastActiveUsers(): Clean up expired events and return least active users.

 Time Complexity:
 - newUserLogin(): O(log M), where M = distinct users.
 - getLeastActiveUsers(): O(K) for removing expired, O(1) for retrieval.
*/

public class LeastActiveUsers {
    private static final long DAY_MS = 24 * 60 * 60 * 1000;
    private Queue<Event> events = new LinkedList<>();
    private Map<String, Integer> counts = new HashMap<>();
    private TreeMap<Integer, Set<String>> countToUsers = new TreeMap<>();

    private static class Event {
        long timestamp;
        String username;

        Event(long timestamp, String username) {
            this.timestamp = timestamp;
            this.username = username;
        }
    }

    public void newUserLogin(String username) {
        long now = System.currentTimeMillis();
        events.add(new Event(now, username));

        int oldCount = counts.getOrDefault(username, 0);
        int newCount = oldCount + 1;
        counts.put(username, newCount);

        updateCountMap(username, oldCount, newCount);
    }

    private void updateCountMap(String username, int oldCount, int newCount) {
        if (oldCount > 0) {
            Set<String> oldSet = countToUsers.get(oldCount);
            if (oldSet != null) {
                oldSet.remove(username);
                if (oldSet.isEmpty()) {
                    countToUsers.remove(oldCount);
                }
            }
        }

        countToUsers.computeIfAbsent(newCount, k -> new HashSet<>()).add(username);
    }

    public List<String> getLeastActiveUsers() {
        long now = System.currentTimeMillis();

        // Remove expired events and update structures
        while (!events.isEmpty() && now - events.peek().timestamp > DAY_MS) {
            Event event = events.poll();
            String user = event.username;

            int oldCount = counts.getOrDefault(user, 0);
            int newCount = oldCount - 1;

            if (newCount <= 0) {
                counts.remove(user);
            } else {
                counts.put(user, newCount);
            }

            updateCountMap(user, oldCount, newCount);
        }

        return countToUsers.isEmpty()
                ? new ArrayList<>()
                : new ArrayList<>(countToUsers.firstEntry().getValue());
    }

    // Example usage
    public static void main(String[] args) throws InterruptedException {
        LeastActiveUsers tracker = new LeastActiveUsers();

        tracker.newUserLogin("alice");
        tracker.newUserLogin("bob");
        tracker.newUserLogin("alice");

        Thread.sleep(1000); // Simulate time delay

        tracker.newUserLogin("charlie");

        List<String> leastActive = tracker.getLeastActiveUsers();
        System.out.println("Least active users: " + leastActive);
    }
}
