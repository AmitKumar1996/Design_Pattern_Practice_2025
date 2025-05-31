package Deloitte;

import java.util.*;


/*
 
 
 Question 2: Closest Warehouse to Customers
Problem Statement
Given warehouse and customer coordinates, map each customer to their closest warehouse.

Approach

Brute Force:

For each customer, compute distance to all warehouses.

Track the closest warehouse.

Complexity

Time: O(M*N) for M customers and N warehouses.

Space: O(1) extra space.
 * */

class Point {
    int x, y;
    Point(int x, int y) { this.x = x; this.y = y; }
}

public class WarehouseFinder {
    public static Map<Point, Point> findClosestWarehouses(List<Point> warehouses, List<Point> customers) {
        Map<Point, Point> result = new HashMap<>();
        for (Point customer : customers) {
            double minDist = Double.MAX_VALUE;
            Point closest = null;
            for (Point warehouse : warehouses) {
                double dist = calculateDistance(customer, warehouse);
                if (dist < minDist) {
                    minDist = dist;
                    closest = warehouse;
                }
            }
            result.put(customer, closest);
        }
        return result;
    }
    
    private static double calculateDistance(Point a, Point b) {
        double dx = b.x - a.x, dy = b.y - a.y;
        return Math.sqrt(dx*dx + dy*dy);
    }
}