package Deloitte;

import java.util.*;


/*
 *Question 1: Least Active Users (Shopping Website)
Problem Statement
Design a system to track user logins and return users with the fewest logins in the last 24 hours. Handle high-volume streams (thousands per minute).

Approach

Data Structures:

Queue<Event>: Stores login events (timestamp, username) in FIFO order.

Map<String, Integer>: Tracks current login counts per user.

TreeMap<Integer, Set<String>>: Maps counts to sets of users for O(1) min-count lookup.

Key Operations:

newUserLogin(username):

Add event to queue.

Update user count in map.

Update TreeMap: Remove user from old count set, add to new count set.

getLeastActiveUsers():

Remove expired events (older than 24 hours) from queue.

Update counts and TreeMap for expired events.

Return users with the smallest count from TreeMap.

Complexity

Time:

newUserLogin(): O(log M) for TreeMap operations (M = distinct users).

getLeastActiveUsers(): O(K) for cleanup (K = expired events), O(1) for min lookup.

Space: O(N) for events and counts (N = events in 24 hours).
 * */






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
            oldSet.remove(username);
            if (oldSet.isEmpty()) countToUsers.remove(oldCount);
        }
        countToUsers.computeIfAbsent(newCount, k -> new HashSet<>()).add(username);
    }
    
    public List<String> getLeastActiveUsers() {
        long now = System.currentTimeMillis();
        while (!events.isEmpty() && now - events.peek().timestamp > DAY_MS) {
            Event event = events.poll();
            String user = event.username;
            int oldCount = counts.get(user);
            int newCount = oldCount - 1;
            counts.put(user, newCount);
            if (newCount == 0) counts.remove(user);
            updateCountMap(user, oldCount, newCount);
        }
        return countToUsers.isEmpty() 
            ? new ArrayList<>() 
            : new ArrayList<>(countToUsers.firstEntry().getValue());
    }
}